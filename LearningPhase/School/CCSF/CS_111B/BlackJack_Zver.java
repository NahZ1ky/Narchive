import java.util.Random;
import java.util.Scanner;

public class BlackJack_Zver {
    public static void main (String[] args) {
        Scanner scnr = new Scanner(System.in);
        Random rdm = new Random();

        int dealerPoints = 0;
        int playerPoints = 0;
        int dealerCards = 0;
        int playerCards = 0;
        int cardOdds = 0;
        int cardFace = 0;
        String gameInput;
        String pH;
        boolean game;
        boolean gameOver = false;
        boolean playerHit;

        System.out.println("Do you want a game of BlackJack? (y/n)");
        gameInput = scnr.next();
        game = (gameInput.equals("y"));
        playerHit = (gameInput.equals("y"));

        if (game){
            System.out.println("Good, we are in.");
            // deal the first card to the player
            while (!gameOver){
                // player phase
                if (playerPoints < 21 && playerHit){
                    // random card:
                    // each cardFace has 7.69% chance of being pull out of the deck
                    // cardFace 10 - 13 all count as 10 SO having cardPoint of 10 will be 30.76%
                    cardOdds = rdm.nextInt(14 - 1) + 1;
                    if (cardOdds < 10){
                        cardFace = rdm.nextInt(10 - 1) + 1;
                        playerCards = playerCards + 1;
                        playerPoints = playerPoints + cardFace;
                        System.out.println("Your got a new card, it's " + cardFace);
                    }
                    else {
                        playerCards = playerCards + 1;
                        playerPoints = playerPoints + 10;
                        System.out.println("Your got a new card, it has the equivalent point as 10, what card face is it? doesn't matter, just keep playing.");
                    }
                    gameOver = playerPoints > 21;
                    }
                }
                // game over if player's point busted
                if (gameOver){
                    System.out.println("You have busted.");

                // dealer phase
                if (dealerPoints < 17 && !gameOver){
                    cardOdds = rdm.nextInt(14 - 1) + 1;
                    if (cardOdds < 10){
                        cardFace = rdm.nextInt(10 - 1) + 1;
                        dealerCards = dealerCards + 1;
                        dealerPoints = dealerPoints + cardFace;
                        System.out.println("Dealer got a " + dealerCards);
                    }
                    else {
                        dealerCards = dealerCards + 1;
                        dealerPoints = dealerPoints + 10;
                        System.out.println("Dealer got a 10");
                    }
                    gameOver = dealerPoints > 21;
                    if (gameOver){
                        System.out.println("The dealer have busted, Great game!");
                    }
                }

                // Report points and card count to the player
                System.out.println("|------------+----------+----------+");
                System.out.println("|            |  Player  |  Dealer  |");
                System.out.println("+------------+----------+----------+");
                System.out.println("|  card count |        " + playerCards + " |        " + dealerCards + " |");
                System.out.println("| point count |        " + playerPoints + " |        " + dealerPoints + " |");
                System.out.println("|------------+----------+----------+");

                // ask if to hit or not
                if (playerCards > 1){
                    System.out.println("");
                    System.out.println("Now do you want to hit? (y/n)");
                    pH = scnr.next();
                    playerHit = (pH.equals("y"));
                }
            }
        }

        else {
            System.out.println("Guess i'll see you next time :)");
        }
    }
}

/*
        // algorithm for letter cards
        if (cardFace > 10){
            cardFace = 10;
        }
        else if (cardFace == 1){
            cardFace = 1;
            int cardFace1 = 11;
        }
        */