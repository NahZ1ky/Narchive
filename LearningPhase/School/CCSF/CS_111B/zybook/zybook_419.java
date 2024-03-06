import java.util.Scanner;

public class zybook_419 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userInt;
        int whiteSpace;
        int countUp = 1;

        userInt = scnr.nextInt();

        for (int i = userInt; i > 0; --i){
            whiteSpace = i * 2 - 2;
            for (int j = 0; j < whiteSpace; ++j){
                System.out.print(" ");
            }
            for (int k = 0; k < countUp; ++k){
                System.out.print("* ");
            }
            countUp = countUp + 1;
            System.out.println();
        }
    }
}
