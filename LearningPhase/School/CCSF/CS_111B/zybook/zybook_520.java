import java.util.Scanner;

public class zybook_520 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numWords;
        String currWord;
        int i;
        int j;
        int frequency;
        String[] userWords = new String[20];

        numWords = scnr.nextInt();
        for (i = 0; i < numWords; i++){
            userWords[i] = scnr.next();
        }
        for (i = 0; i < numWords; i++){
            currWord = userWords[i];
            frequency = 0;
            for (j = 0; j < numWords; j++){
                if (currWord.equals(userWords[j])){
                    frequency++;
                }
            }
            System.out.println(currWord + " - " + frequency);
        }
    }
}
