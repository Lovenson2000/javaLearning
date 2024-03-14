/* Write a program to calculate the 
factorial of 10 using recursion
*/

public class Recursion {

    static int calculateFactorial(int n) {

        if (n <= 1) {
            return n;
        }
        return n * calculateFactorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(calculateFactorial(10));
    }
}