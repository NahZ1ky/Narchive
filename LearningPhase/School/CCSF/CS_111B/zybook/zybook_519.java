import java.util.Scanner;

public class zybook_519 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[] userValues = new int[20];   // List of integers from input
        int count;
        int maxVal;
        int i;

        count = scnr.nextInt();
        for (i = 0; i < count; i++){
            userValues[i] = scnr.nextInt();
        }
        maxVal = scnr.nextInt();

        for (i = 0; i < count; i++){
            if (userValues[i] < maxVal){
                System.out.print(userValues[i] + ",");
            }
        }
        System.out.println();
    }
}