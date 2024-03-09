// Author: Ziky
// Assignment: DNAfragments.java
// Part: #4
// Last Modification: 03/08/2024
// Compatibility to Original: false

import java.util.*;

public class Fragment_zver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // initialize fragmentList
        System.out.println("How many fragments do you want in this program?");
        int fragmentCount;
        fragmentCount = scanner.nextInt();
        String[] fragmentList = new String[fragmentCount];
        for (int i = 0; i < fragmentCount; i++){
            System.out.print("Enter DNA fragment: ");
            fragmentList[i] = scanner.next();
        }

        // find matched fragment number
        String targetFragmentName;
        System.out.println("\nWhat fragment would you like to delete? ");
        targetFragmentName = scanner.next();
        int matchedFragmentCount = 0;
        for (int i = 0; i < fragmentCount; i++){
            if (targetFragmentName.equals(fragmentList[i])){
                matchedFragmentCount++;
            }
        }
        int newFragmentCount = fragmentCount - matchedFragmentCount;

        // print results
        if (newFragmentCount == fragmentCount){
            System.out.println("There are no matched fragment");
            return;
        } else if (newFragmentCount == 0){
            System.out.println("There is no fragment left after deletion");
            return;
        } else {
            /*
            String[] newFragmentList = new String[newFragmentCount];
            int newFragmentIndex = 0;
            for (int i = 0; i < fragmentCount; i++){
                if (!targetFragmentName.equals(fragmentList[i])){
                    newFragmentList[newFragmentIndex] = fragmentList[i];
                    newFragmentIndex++;
                }
            } */
            ArrayList<String> newFragmentList = new ArrayList<String>();
            for (int i = 0; i < fragmentCount; i++){
                if (!targetFragmentName.equals(fragmentList[i])){
                    newFragmentList.add(fragmentList[i]);
                }
            }
            System.out.println("The fragment list after the deletion of " + matchedFragmentCount + " " + targetFragmentName + " is shown below.");
            System.out.println("Updated fragment list: " );
            for (int i = 0; i < newFragmentCount; i++){
                System.out.print(newFragmentList.get(i) + " ");
            }
        }
    }
}
