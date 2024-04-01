package Java;

public class Non_Bouncy_Number {
    public static void main(String[] args) {
        long num;
        char single1;
        char single2;
        String state;
        long numNonBouncy;

        for (num = 0; num < 10000000000L; num++) {
            String stringNum = String.valueOf(num);
            int numLength = stringNum.length();
            single1 = stringNum.charAt(0);
            for (int index = 0; index < 2; index++) {
                single2 = stringNum.charAt(index);
                if (single1 < single2) {
                    state = "decreasing";
                } else if (single1 > single2) {
                    state = "increasing";
                } else {
                    state = "still";
                }
            }
        }
    }
}
