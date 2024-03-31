/*
 * Working from left-to-right if no digit is exceeded by the digit to its left it is called an increasing number; for example, 134468.
 * Similarly if no digit is exceeded by the digit to its right it is called a decreasing number; for example, 66420.
 * We shall call a positive integer that is neither increasing nor decreasing a "bouncy" number; for example, 155349.
 * As n increases, the proportion of bouncy numbers below n increases such that there are only 12951 numbers below one-million that are not bouncy and only 277032 non-bouncy numbers below 10^10.
 *
 * How many numbers below a googol (10^100) are not bouncy?
 */

package Java;

public class Non_bouncy_Numbers {
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
