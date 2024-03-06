import java.util.Scanner;

public class zybook_518 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numList = new int[10];
        int length = 0;

        while (true){
            if (length > 9){
                System.out.println("Too many numbers");
                return;
            }
            int value = scanner.nextInt();
            if (value < 0){
                break;
            }
            numList[length++] = value;
        }

        int middleVal = (length - 1) / 2;
        System.out.println("Middle item: " + numList[middleVal]);
    }
}