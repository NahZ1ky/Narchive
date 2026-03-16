/*
* If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, and 9. The sum of these multiples is 23.
* Find the sum of all the multiples of 3 or 5 below 1000.
*/
package Java;

public class Multiples_of_3_or_5 {
    public static void main(String[] args) {
        // multiples of 3 & 5 under 10
        int sum = 0;

        for (int i = 0; i < 10; i++){
            if ((i % 3 == 0) || (i % 5 == 0)) {
                sum += i;
            }
        }
        System.out.println("sum: " + sum);


        // multiples of 3 & 5 under 10
        sum = 0;
        for (int i = 0; i < 1000; i++){
            if ((i % 3 == 0) || (i % 5 == 0)) {
                sum += i;
            }
        }
        System.out.println("sum: " + sum);
    }
}
