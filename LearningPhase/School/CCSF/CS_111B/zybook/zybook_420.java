import java.util.Scanner;

public class zybook_420 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userInt;
        userInt = scnr.nextInt();
        int countdown = userInt;

        // logic
        for (int i = 0; i < userInt; ++i){
            for (int j = 0; j < countdown; ++j){
                System.out.print("* ");
            }
            countdown --;
            System.out.println();
        }
    }
}
