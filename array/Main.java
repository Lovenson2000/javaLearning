package array;

import java.util.Arrays;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        int[] numbers = { 23, 45, 21, 6, 34, 90 };
        // System.out.println(numbers[6]); // ArrayIndexOutOfBoundsException

        Arrays.sort(numbers);
        int index = Arrays.binarySearch(numbers, 34);
        System.out.println(index);

    }
}