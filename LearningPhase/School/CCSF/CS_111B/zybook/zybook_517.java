import java.util.*;

public class zybook_517 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[] userList = new int[20];   // List of numElement integers specified by the user
        int numElements;                // Number of integers in user's list
        // Add more variables as needed
        numElements = scnr.nextInt();   // Input begins with number of integers that follow
        int i;

        for (i = 0; i < numElements; i++){
            userList[i] = scnr.nextInt();
        }
        for (i = (numElements - 1); i >= 0; i--){
            if (i >= 0){
                System.out.print(userList[i] + ",");
            }
        }
        System.out.println();
    }
}
