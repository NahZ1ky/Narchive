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