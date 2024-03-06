import java.util.Scanner;

public class zybook_415 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userInt;
        int sumInts;
        int numInts;
        int maxInt;
        double average;

        //initializations

        sumInts = 0;
        numInts = 0;
        maxInt  = -1;
        userInt = scnr.nextInt();

        while (userInt >= 0){
            sumInts = sumInts + userInt;
            if (maxInt < userInt){
                maxInt = userInt;
            }
            numInts ++;
            userInt = scnr.nextInt();
        }
        average = Double.valueOf(sumInts) / Double.valueOf(numInts);

        //Printing
        System.out.print(maxInt + " ");
        System.out.printf("%.2f\n", average);
   }
}

