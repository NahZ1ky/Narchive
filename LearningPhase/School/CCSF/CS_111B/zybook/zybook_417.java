import java.util.Scanner;

public class zybook_417 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userInput1;
        int userInput2;

        //initializing
        userInput1 = scnr.nextInt();
        userInput2 = scnr.nextInt();
        int process = userInput1;

        if (userInput1 > userInput2){
            System.out.println("Second integer can't be less than the first.");
        }
        else{
            System.out.print(process + " ");
            while (process < userInput2){
                process += 5;
                if (process < userInput2){
                    System.out.print(process + " ");
                }
            }
            System.out.println();
        }


    }
}
