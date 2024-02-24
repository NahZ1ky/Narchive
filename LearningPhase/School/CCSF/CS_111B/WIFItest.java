// Author: Xirong (Ziky) Zhang
// Date of Last Modification: 02/02/2024
// Course: CS-111B
// Instructor: C. Conner
// Assignment #2
// File Name: WIFItest.java
// What does this program do:
// Ask and help user to filter out all possible problems could happen ->
//    that causes WIFI connection problem step by step
//
// Algorithm:
//    ┌──────────┐
//    │          ↓
//    │ Ask user question if the solution in current chat solves the problem
//    │     i. yes
//    │         a. end program
//    │     ii. no
//    │         a. output next possible solution
//    │         b. wait for user input
//    └─────────┘
//

import java.util.Scanner;

public class WIFItest {
    static void Ask(){
    }
    public static void main(String[] args) {
        String statusInput;
        boolean passed;
        boolean failed;
        Scanner input = new Scanner(System.in);

        System.out.println("Reboot the computer and try to connect.");
        System.out.println("Did that fix the problem?");
        statusInput = input.next();
        statusInput = statusInput.toLowerCase();
        passed = (statusInput.equals("yes"));
        failed = (statusInput.equals("no"));

        if (passed){
            System.out.println("Glad to be of help.");
        }
        else if (failed){
            System.out.println("Reboot the router and try to connect.");
            System.out.println("Did that fix the problem?");
            statusInput = input.next();
            statusInput = statusInput.toLowerCase();
            passed = (statusInput.equals("yes"));
            if (passed){
                System.out.println("Glad to be of help.");
            }
            else if (failed){
                System.out.println("Make sure the cables between the router and modem are plugged in firmly.");
                System.out.println("Did that fix the problem?");
                statusInput = input.next();
                statusInput = statusInput.toLowerCase();
                passed = (statusInput.equals("yes"));
                if (passed){
                    System.out.println("Glad to be of help.");
                }
                else if (failed){
                    System.out.println("Move the router to a new location and try to connect.");
                    System.out.println("Did that fix the problem?");
                    statusInput = input.next();
                    statusInput = statusInput.toLowerCase();
                    passed = (statusInput.equals("yes"));
                    if (passed){
                        System.out.println("Glad to be of help.");
                    }
                    else if(failed){
                        System.out.println("Get a new router.");
                    }
                    else if ((!passed) && (!failed)){
                        System.out.println("Invalid Input, Please Re-run the Program.");
                    }
                }
                else if ((!passed) && (!failed)){
                    System.out.println("Invalid Input, Please Re-run the Program.");
                }
            }
            else if ((!passed) && (!failed)){
                System.out.println("Invalid Input, Please Re-run the Program.");
            }
        }
        else if ((!passed) && (!failed)){
            System.out.println("Invalid Input, Please Re-run the Program.");
        }
    }
}
