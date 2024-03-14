/*
ALGORITHM:
I. initialize ALGORITHM:
II.  Display board
III. While no win or tie
     A. player takes a turn
     B. change player
*/

// Author(s): Constance Conner and Ziky Zhang and 
// Date of Last Modification: 03/8/2024
// Course: CS111B
// Instructor: C. Conner
// File Name: TicTacToeStub.java
// This program will plays a simplified version of Tic Tac Toe using 2-D array


import java.util.Scanner;

public class TicTacToeStub{
    // Board size initialize
    public static char[][] initBoard(int size)
    {
        Scanner scnr = new Scanner(System.in);
        size = scnr.nextInt();
        char[][] board = new char[size][size];
        return null;
    }

    // Display board
    public static String display(char[][] board[][]){
        System.out.println("\n--------");
        for(int row=0; row < board.length; row++)
        {
        for(int col=0; col < board[row].length; col++)
            System.out.print(board[row][col] + "  ");
        System.out.println();
        System.out.println("--------");
        }
        System.out.println();
        return null;
    }

    ///////  STEP 3: check for win ////////
    public static boolean isWinner(char move, char [][] board)
    {
        boolean win = false;
        if (!win){ // checking row
            for (int i = 0; i < board.length; i++){
                char initial = board[i][0];
                for (int j = 1; j < board.length; j++){
                    if (initial != board[i][j]){
                        break;
                    } else if ((initial == board[i][2]) && (initial == move)){
                        win = true;
                        return true;
                    }
                }
            }
        } if (!win){ // checking column
            for (int j = 0; j < board.length; j++){
                char initial = board[0][j];
                for (int i = 1; i < board.length; i++){
                    if (initial != board[i][j]){
                        break;
                    } else if ((initial == board[2][j]) && (initial == move)){
                        win = true;
                        return true;
                    }
                }
            }
        } if (!win){ // checking diagonal > \
            for (int i = 0; i < 3; i++){
                char initial = board[0][0];
                if (initial != board[1][1]){
                    break;
                } else if ((initial == board[2][2]) && (initial == move)){
                    win = true;
                    return true;
                }
            }
        } if (!win){ // checking diagonal > /
            if ((board[0][2] == board[1][1]) && (board[1][1] == board[2][0]) && board[0][2] == move){
                win = true;
                return true;
            }
        }
        return false;
    }

    ///////  STEP 4: check for tie ////////
    public static boolean isTie(char [][] tieBoard)
    {
        boolean allDash = true;
        for (int i = 0; i < tieBoard.length; i++){
            for (int j = 0; j < tieBoard.length; j++){
                if (tieBoard[i][j] == '-'){
                    allDash = false;
                }
            }
        }
        if (!allDash){
            return false;
        } else {
            return true;
        }
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

        /////// beginning of display board ////////
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

