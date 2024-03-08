// Author: Xirong (Ziky) Zhang & Shawn Luna & Azeal Riday
// Date of Last Modification: 03/06/2024
// Course: CS-111B
// Instructor: C. Conner
// Assignment #4-2
// File Name: DNAfragments.java
//
/* Algorithms:
 *     1. Declare variables
 *     2. Get arrayLength & arrayContent
 *     3. Initialize variables
 *   ───────────────────────────────────────────────────────────────
 *     1. print values in reverse
 *     ┌─────────┐
 *     |         ↓
 *     |  a. count the index number down
 *     |  b. print the according value in the array
 *     └─────────┘
 *
 *     2. print the longest value
 *     ┌─────────┐
 *     |         ↓
 *     |  a. read current value's length
 *     |     i. count characters
 *     |  b. compare with the longest value yet
 *     |     if current value is longer:
 *     |     i. replace
 *     └─────────┘
 *        c. print results.
 *
 *     3. ask the user to delete value
 *        a. get input from user
 *        b. check if input matches with any existing values
 *           if matches:
 *           i. create new variables
 *           ii. put the original value in except for the new input value.
 *           iii. print result.
 *           if not:
 *           i. print error.
 */

import java.util.Scanner;

public class DNAfragments {
    public static void main(String args[]) {
        Scanner scnr = new Scanner(System.in);

        int i;

        // user input initialize values
        int dnaCount;
        System.out.println("Welcome to the DNA Fragment Helper!");
        System.out.println();
        System.out.print("How many DNA fragments: ");
        dnaCount = scnr.nextInt();
        String[] frags = new String[dnaCount];
        for (i = 0; i < dnaCount; i++){
            System.out.print("Enter DNA fragment: ");
            frags[i] = scnr.next();
        }

        // print fragments in reverse
        System.out.println("\nHere is fragment sequence in reverse:");
        for (i = dnaCount - 1; i >= 0; i--){
            System.out.print(frags[i]+ " ");
        }
            System.out.println();

        // print largest fragment
        String longestFrag = "";
        for (String fragment : frags) {
            if (fragment.length() > longestFrag.length()) {
                longestFrag = fragment;
            }
        }
        System.out.print("Longest fragment with " + longestFrag.length() + " letters:\n");
        System.out.print(longestFrag + "\n");


        // removing a fragment
        String removedFrag = "";
        System.out.println("Enter fragment to delete: ");
        removedFrag = scnr.next();

        boolean listedFrag = false;
        for (String fragment : frags) {
            if (fragment.equals(removedFrag)) {
                listedFrag = true;
                break;
            }
        }

        if (listedFrag) {
            String[] newFrag = new String[dnaCount - 1];
            int j = 0;
            for (i = 0; i < dnaCount; i++) {
                if (!frags[i].equals(removedFrag)) {
                    newFrag[j] = frags[i];
                    j++;
                }
            }

            System.out.println("Here is the updated sequence:");
            for (i = 0; i < newFrag.length; i++) {
                System.out.print(newFrag[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println(removedFrag + " is not on the list.");
        }

    }
}