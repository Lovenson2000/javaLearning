/**
 * Fibonnaci series with numbers up to 100;
 */
public class Fibonacci {

    static final int LIMIT_NUMBER = 100;

    public static void main(String[] args) {

        int low = 1;
        int high = 1;
        System.out.println(low);

        while (high < LIMIT_NUMBER) {

            int next = high + low;
            System.out.println(next);
            low = high;
            high = next;
        }
    }
}