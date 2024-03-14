/* Write a program to calculate the 
factorial of 10 using recursion
*/

public class Recursion {

    public int calculateFactorial(int n) {

        if (n <= 1) {
            return n;
        }
        return n * calculateFactorial(n - 1);
    }

    static int sumOfSubsequentNumbers(int n) {

        if (n > 0) {
            return n + sumOfSubsequentNumbers(n-1);
        }
        return 0;
    }

    public static void main(String[] args) {
        Recursion recursion = new Recursion();
        int result = recursion.calculateFactorial(10);
        System.out.println(result);

        System.out.println(sumOfSubsequentNumbers(10));
    }
}