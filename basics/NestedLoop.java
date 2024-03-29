/*Write a program to print the series: 
(1, 1) (1, 2) (1, 3)
(2, 1) (2, 2) (2,3)
(3, 1) (3, 2) (3, 3)
*/

public class NestedLoop {
    public static void main(String[] args) {

        int number = 45;
        float floatNumber = number; // Widening type casting

        double longNumber = 4342343;
        short shortNumber = (short) longNumber; // Narrowing Casting (potential data loss)

        System.out.println(shortNumber);

        System.out.println(number + " " + floatNumber);

        for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= 3; j++) {

                System.out.println(i + ", " + j);
            }
        }
    }
}