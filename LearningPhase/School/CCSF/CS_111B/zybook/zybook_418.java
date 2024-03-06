import java.util.Scanner;

public class zybook_418 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userInput;
        int chat;

        userInput = scnr.nextLine();

        while (!userInput.equals("Done") && !userInput.equals("done") && !userInput.equals("d")){
            chat = userInput.length() - 1;
            for (int i = 0; i < userInput.length(); ++i){
                System.out.print(userInput.charAt(chat));
                chat = chat - 1;
            }
            System.out.println("");
            userInput = scnr.nextLine();
        }
    }
}
