// Author: Xirong (Ziky) Zhang & Josue Cruz
// Date of Last Modification: 02/15/2024
// Course: CS-111B
// Instructor: C. Conner
// Assignment #3
// File Name: BlackJack.java
//
/* Algorithm:
 *     1. Draw two cards to both player and dealer
 *     2. Both player's cards are print out but only one is for the dealer
 *        ┌───────────────┐
 *        |               ↓
 *        | i. Check if the player has not busted yet and want to draw a card
 *        |   if so:
 *        |      a. Draw a card for the player
 *        |      b. Calculate and print out the running total for player
 *        |      c. Check player's point for game status
 *        |        if game has finished:
 *        |          A. Print result
 *        |        if not:
 *        |          A. Check player's intention on keep hitting
 *        |          B. Update game status
 *        └───────────────┘
 *        ┌───────────────┐
 *        |               ↓
 *        | i. Check game status and if dealer's point have not hit 17
 *        |   if so:
 *        |      a. Draw a card for the dealer
 *        |      b. Calculate and print out the running total for dealer
 *        |      c. Check dealer's point for game status
 *        |        if game has finished:
 *        |          A. Print result
 *        └───────────────┘
 *     Check game status (has the game over?)
 *       if so:
 *         a. Compare player & dealer's points
 *         b. Determine the final result
 */

import java.util.Random;
import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Random rdm = new Random();

        // create required variables
        int cardFace;
        int playerPoints = 0;
        int dealerPoint = 0;
        String playerHitString;
        boolean playerHit = true;
        boolean gameOver = false;

        // deal two cards to each player
        cardFace = rdm.nextInt(9) + 2;
        System.out.print("Player hand: " + cardFace + " ");
        playerPoints = playerPoints + cardFace;
        cardFace = rdm.nextInt(9) + 2;
        System.out.println(cardFace);
        playerPoints = playerPoints + cardFace;
        System.out.println("Player Total: " + playerPoints);
        System.out.println("--------------------------------");

        cardFace = rdm.nextInt(9) + 2;
        System.out.println("Dealer's 1st hand: " + cardFace + "  2nd hand is covered");
        dealerPoint = dealerPoint + cardFace;
        cardFace = rdm.nextInt(9) + 2;
        dealerPoint = dealerPoint + cardFace;
        System.out.println("--------------------------------");

        // enters the loops
        // player phase
        while ((playerPoints < 22) && (playerHit)){
            cardFace = rdm.nextInt(9) + 2;
            System.out.println("You got a " + cardFace);
            playerPoints = playerPoints + cardFace;
            if (playerPoints < 21){
                System.out.println("Player Total: " + playerPoints);
                System.out.println("You wanna HIT or STAND? (h/s)");
                playerHitString = scnr.nextLine();
                playerHit = playerHitString.equalsIgnoreCase("h");
                playerHit = playerHitString.equalsIgnoreCase("s");
            }
            else if (playerPoints == 21){
                System.out.println("You have won!");
                gameOver = true;
            }
            else{
                System.out.println("You're busted.");
                gameOver = true;
            }
        }

        // dealer phase
        while ((dealerPoint < 17) && (!gameOver)){
            cardFace = rdm.nextInt(9) + 2;
            System.out.println("Dealer got a " + cardFace);
            dealerPoint = dealerPoint + cardFace;
            if (dealerPoint == 21){
                System.out.println("Dealer hit 21! You have lost.");
                gameOver = true;
            }
            else if (dealerPoint > 21){
                System.out.println("Dealer have busted, all other players win.");
                gameOver = true;
            }
            else if (dealerPoint > 16){
                System.out.println("Dealer Total: " + dealerPoint);
            }
        }

        // if both player & dealer have not busted yet, enters the comparing phase & result printing phase
        if (!gameOver){
            System.out.println("Dealer's total points is " + dealerPoint);
            System.out.println("Player's total points is " + playerPoints);
            if (dealerPoint > playerPoints){
                System.out.println("Dealer wins.");
                gameOver = true;
            }
            else if (dealerPoint < playerPoints){
                System.out.println("You have won.");
                gameOver = true;
            }
            else if (dealerPoint == playerPoints){
                System.out.println("You've got the same points, push.");
            }
        }
    }
}
