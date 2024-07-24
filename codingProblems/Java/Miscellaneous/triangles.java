/*
 * Print the following shapes using loop(s)
 * 1 *****		12345 &		@
 * 12 ****		1234 &&		@@
 * 123 ***		123 &&&		@ @
 * 1234 **		12 &&&&		@  @
 * 12345 *		1 &&&&&		@   @
 * 123456	     &&&&&&		@@@@@@
 */
package Java.Miscellaneous;

public class triangles {
    public static void main(String[] args) {
        numberStar(6);
    }

    public static void numberStar(int limit) {
        // number triangles with asterisks
        for (int i = 0; i < limit; i++) {
            for (int j = 0; j < (i + 1); j++) {
                System.out.print((j + 1));
            }
            System.out.print(" ");
            for (int j = limit; j > (i + 1); j--) {
                System.out.print("*");
            }
        System.out.println();
        }
    }

    public static void numberAmpersand(int limit) {
        int ampersandCount = 1;
        for (int i = limit; i > 0; i--) {
            for (int j = 0; j < limit; j++) {
                System.out.print(j + 1);
            }
            System.out.print(" ");
            for (int j = 0; j < ampersandCount; j++) {
                System.out.print("&");
                ampersandCount++;
            }
            System.out.println();
        }
    }
}
