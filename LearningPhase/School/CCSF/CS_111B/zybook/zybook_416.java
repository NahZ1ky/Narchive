import java.util.Scanner;

public class zybook_416 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        char inputChar;
        String inputString;
        int numChars;

        //initializing for logic
        numChars = 0;
        inputChar = scnr.next().charAt(0);
        inputString = scnr.nextLine();

        //logic
        for (int i = 0; i < inputString.length(); ++i){
            if (inputChar == inputString.charAt(i)){
                numChars ++;
            }
        }

        if (numChars == 1){
            System.out.println(numChars + " " + inputChar);
        }
        else {
            System.out.println(numChars + " " + inputChar + "'s");
        }
     }
}
