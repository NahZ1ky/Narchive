// Author: Ziky Zhang
// Date of Last Modification: 
// Course: CS111B
// File Name: ticTacToe_zver.java

import java.util.*;

public class ticTacToe_zver{
    ///////  STEP 1: initialize board ////////
    // board will be size x size array
    // use a nested for-loop to initialize/assign
    // each element to a dash '-'
    public static char[][] initBoard(int size){
        char board[][] = new char[size][size];
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                board[i][j] = '-';
            }
        }
        return null;
    }

    ///////  STEP 2: display board ////////
    // Display the current status of the board on the
    // screen using nested for-loop to display each element
    // and using underscores (_) to separate rows
    public static String printBoard(char[][] board){
        for (int i = 0; i < board.length; i++){
            System.out.println("________");
            for (int j = 0; j < board[0].length; j++){
                System.out.print(board[i][j]  + "  ");
            }
            System.out.println();
        }
        System.out.println("________");
        return null;
    }

    ///////  STEP 3: check for win ////////
    // check 3 rows, 3 columns, 2 diagonals
    // return true if we have a winner
    public static boolean isWinner(char move, char[][] board)
    {
        boolean win = true;
        for (int i = 0; i < board.length; i++){
            char row = board[i][0];
            for (int j = 1; j < (board[0].length - 1); j++){
                if (row == board[i][j]){
                    row = board[i][j];
                } else {
                    win = false;
                    break;
                }
            }
            if (win){
                return true;
            }
        }
        for (int i = 0; i < board.length; i++){
            char column = board[0][i];
            for (int j = 1; j < (board[0].length - 1); j++){
                if (column == board[j][i]){
                    column = board[j][i];
                }
            }
        }

        return true;
    }

    ///////  STEP 4: check for tie ////////
    // check each element in board
    // if any element is not a dash (-) tie is false
    public static boolean isTie(char [][] tieBoard)
    {
        // YOUR CODE HERE
        return false;
    }

    ///////  takeTurn  ////////
    // Allow the curPlayer to take a turn.
    // Ask user for row col to play
    // Read user's input and verify that it is a
    // valid move (array element has not been chosen).
    // When a valid move is entered,
    // put it on the board.
    //
    // STEP 5: Check if game is over (YOU WILL WRITE THIS NESTED if/else) below

    public static boolean takeTurn(char thePlayer, char [][] board)
    {
        int row = 0;
        int col = 0;

        boolean isGameOver = false; //do we have a win or a tie

        Scanner scan = new Scanner(System.in);


        System.out.println(thePlayer +  " your turn. Enter row col (0 0 is top left): ");
    // System.out.print("Example 0 0 is top left: ");
        row = scan.nextInt();
        col = scan.nextInt();


        //if array element is not a dash (-) user must choose again
        //as that move is invalid
        while (board[row][col] != '-')
        {
            System.out.println("Invalid entry: Row " + row + " at Column " + col
                            + " already contains: " + board[row][col]);
            System.out.println("Please try again.");
            row = scan.nextInt();
            col = scan.nextInt();
        }

        // Now that input validation loop is finished, put the move on the board:
        board[row][col] = thePlayer;


        /// STEP 5: Check if game is over (YOU WILL WRITE THIS NESTED if/else/if)
        // I. if isWinner
        //    A.  display "You Won!!"
        //   B.  set isGameOver to true
        // else
        //    A'. if isTie
        //          1. display "It's a Tie!"
        //          2. set isGameOver to true
        //         else
        //           1'. set isGameover to false

        return isGameOver;


    }

    ///////  play the game ////////
    //  while game not over
    //  user takes a turn
    //      checks for win or tie
    //  alternate play between player X and O
    public static void main(String [] args)
    {
        char curPlayer = 'X'; //first player is X
        char[][] board;       //tic tac toe board as 2-D array
        boolean gameOver = false;


        board = initBoard(3);
        System.out.println("***LET'S PLAY TIC TAC TOE***");

        /////// beginning of  display board ////////
        // STEP 2: PUT CODE TO DISPLAY INTO A METHOD named display SEE STEP 2 ABOVE

        ///////  end of display board ////////
        ///CALL display METHOD HERE passing board as argument

        //game continues while there is no winner or tie
        while( !gameOver )
        {

        //player makes a move and we check if win or tie
        gameOver = takeTurn(curPlayer, board);

        /////// beginning of  display board ////////
        // STEP 2: REPLACE THIS CODE WIth A CALL TO display METHOD
        //passing board as argument
        System.out.println("\n--------");
        for(int row=0; row < board.length; row++)
        {
            for(int col=0; col < board[row].length; col++)
            System.out.print(board[row][col] + "  ");
            System.out.println();
            System.out.println("--------");
        }
        System.out.println();
        ///////  end of display board ///////
        //CALL THE display METHOD HERE



        if(curPlayer == 'X') //change player
            curPlayer = 'O';
            else
            curPlayer = 'X';

        }

    } //end main

}  //end class

