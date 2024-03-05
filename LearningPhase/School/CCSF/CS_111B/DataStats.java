// Author: Xirong (Ziky) Zhang & Shawn Luna & Azeal Riday
// Date of Last Modification: 03/02/2024
// Course: CS-111B
// Instructor: C. Conner
// Assignment #4
// File Name: DataStats.java
//
/* Algorithms:
 *     1. Declare variables
 *     2. Get arrayLength & arrayContent
 *     3. Initialize variables
 *  ────────────────────────────────────────────────────────────────────────────────
 *     1. Greatest & Smallest number       // Start calculation phase
 *        i. greatest number
 *         ┌─────────┐
 *         |         ↓
 *         | A. initialize "maximum" to the first number on the list
 *         |    a. compare the "maximum" with value on current position in "arrVal"
 *         |    b. "arrVal" will replace the "maximum" if it is larger than current "maximum"
 *         └─────────┘
 *       ii. smallest number
 *         ┌─────────┐
 *         |         ↓
 *         | A. initialize "minimum" to the first number on the list
 *         |    a. compare the "minimum" with value on current position in "arrVal"
 *         |    b. "arrVal" will replace the "minimum" if it is smaller than current "minimum"
 *         └─────────┘
 *     2. Mean
 *        i. add up all the numbers in the list and divide by "arrLen"
 *     3. Palindrome
 *      ┌────────┐
 *      |        ↓
 *      | i. check if "isPalindrome" is true
 *      |    if is:
 *      |    A. check value on "i" compare to '"arrLen" - "i"'
 *      |       if doesn't match:
 *      |       a. set "isPalindrome" to not true
 *      |    B. shift "i" to the next slot
 *      └────────┘
 *     4. Median
 *        i. sort "arrCon"
 *        ii. locate the two or one number in the middle of the list
 *           if there're two numbers:
 *           A. calculate the average of the numbers
 *           B. set the calculated number as median
 *           if there's one number:
 *           A. set the number as median
 *     5. Mode
 *        i. declare and initialize locally needed variables
 *      ┌────────┐
 *      |        ↓
 *      | ii. select the number "i" as reference
 *      |   ┌────────┐
 *      |   | A. check if "i" match with "j"
 *      |   |    if match:
 *      |   |    a. "count" goes up by one
 *      |   | B. shift "j" to the next slot
 *      |   | C. record the match count and according position
 *      |   └────────┘
 *      |     C. shift "i" to the next slot
 *      |     D. check if current match is the greatest
 *      |        if is:
 *      |        a. set "maxVal" & "maxCnt" with current value's info
 *      └────────┘
 *        iii. return values
 *     6. Normalize
 *        i. take "maximum" which we have found earlier
 *        ii. make each number in the list divide by it
 *        iii. print normalized values
 */

import java.util.*;

public class DataStats {
    public static void main(String args[]) {
      Scanner scnr = new Scanner(System.in);
        int minimum;
        int maximum;
        int total;
        double mean;
        boolean isPalindrome;
        double median;
        int i, j;
        double noVal;

        // get arrayLength & arrayContent from user input
        System.out.println("Enter length of Array:  ");
        int arrLen;
        arrLen = scnr.nextInt();
        int[] arrCon = new int[arrLen];
        System.out.print("Enter " + arrLen + " numbers: ");
        for (i = 0; i < arrLen; i++){
            arrCon[i] = scnr.nextInt();
        }
        System.out.println();

        // initialize variables
        maximum = arrCon[0];
        minimum = arrCon[0];
        total = 0;
        isPalindrome = true;
        median = 0;

        // calculate and print out maximum and minimum
        for (i = 0; i < arrLen; i++){
            if (arrCon[i] > maximum){
                maximum = arrCon[i];
            }
            if (arrCon[i] < minimum){
                minimum = arrCon[i];
            }
        }
        System.out.println("Minimum: " + minimum);
        System.out.println("Maximum: " + maximum);

        // calculate and print out the mean
        for (i = 0; i < arrLen; i++){
            total = total + arrCon[i];
        }
        mean = (float) total / arrLen;
        System.out.println("Mean: " + mean);

        // test and print out the result for palindrome test
        for (i = 0; i < arrLen / 2; i++){
            if ((arrCon[i] == arrCon[arrLen - i - 1]) && (isPalindrome)){
                isPalindrome = true;
            }
            else{
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Palindrome: " + isPalindrome);

        // sort, locate, calculate, and print out the median
        Arrays.sort(arrCon);
        if (arrLen % 2 == 1){
            median = arrCon[arrLen / 2];
        }
        else {
            median = (arrCon[arrLen / 2 - 1] + arrCon[arrLen / 2]) / 2;
        }
        System.out.println("Median: " + median);

        // find and print mode
        // initialize appropriate variables
        int maxVal = 0, maxCnt = 0;

        for (i = 0; i < arrLen; ++i) {
            int count = 0;

            for (j = 0; j < arrLen; ++j) {
                if (arrCon[j] == arrCon[i]){
                    ++count;
                }
            }
            if (count > maxCnt) {
               maxCnt = count;
               maxVal = i;
            }
        }
        System.out.println("Mode: " + arrCon[maxVal]);

        // calculate and print normalize value
        System.out.print("Normalize: ");
        for (i = 0; i < arrLen; ++i){
            noVal = (float) arrCon[i] / maximum;
            if (i != 0){
                System.out.print(", ");
            }
            System.out.printf("%.2f", noVal);
        }
        System.out.println();

  }
}