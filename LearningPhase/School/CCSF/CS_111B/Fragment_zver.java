// Author: Ziky
// Assignment: DNAfragments.java
// Part: #4
// Last Modification: 03/07/2024
// Compatibility to Original: false

import java.util.*;

public class Fragment_zver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // initialize fragmentList
        System.out.println("How many fragments do you want in this program?");
        int numFragment;
        numFragment = scanner.nextInt();
        String[] fragmentList = new String[numFragment];
        for (int i = 0; i < numFragment; i++){
            System.out.print("Enter DNA fragment: ");
            fragmentList[i] = scanner.next();
        }

        // find matched fragment number
        String targetFragmentName;
        System.out.println("\nWhat fragment would you like to delete? ");
        targetFragmentName = scanner.next();
        int matchedFragmentNum = 0;
        for (int i = 0; i < numFragment; i++){
            if (targetFragmentName.equals(fragmentList[i])){
                matchedFragmentNum++;
            }
        }
        int newNumFragment = numFragment - matchedFragmentNum;

        // print results
        if (newNumFragment == numFragment){
            System.out.println("There are no matched fragment");
        } else if (newNumFragment == 0){
            System.out.println("There is no fragment left after deletion");
        } else {
            String[] newFragmentList = new String[newNumFragment];
            int newFragmentIndex = 0;
            for (int i = 0; i < newNumFragment; i++){
                if (targetFragmentName != fragmentList[i]){
                    newFragmentList[newFragmentIndex] = fragmentList[i];
                    newFragmentIndex++;
                }
            }
            System.out.println("The fragment list after the deletion of " + matchedFragmentNum + " " + targetFragmentName + " is shown below.");
            System.out.println("Updated fragment list: " );
            for (int i = 0; i < newNumFragment; i++){
                System.out.print(newFragmentList[i] + " ");
            }
        }

    }
}
