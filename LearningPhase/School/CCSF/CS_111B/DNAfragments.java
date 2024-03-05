import java.util.Scanner;

public class DNAfragments {
    public static void main(String args[]) {
        Scanner scnr = new Scanner(System.in);
        int i;

        // user input initialize values
        int dnaCount;
        System.out.println("Welcome to the DNA Fragment Helper");
        System.out.print("How many DNA Fragments: ");
        dnaCount = scnr.nextInt();
        String[] frags = new String[dnaCount];
        for (i = 0; i < dnaCount; i++){
            System.out.print("Enter DNA fragment: ");
            frags[i] = scnr.next();
        }

        // print fragments in reverse
        System.out.println("Here is fragment sequence in reverse:");
        for (i = (dnaCount - 1); i >= 0; i--){
            System.out.print(frags[i] + " ");
        }



  }
}