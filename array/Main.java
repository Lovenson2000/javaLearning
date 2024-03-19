package array;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Integer[] numbers = { 23, 45, 21, 6, 34, 90 };
        // System.out.println(numbers[6]); // ArrayIndexOutOfBoundsException

        Integer[] copyNumbers = Arrays.copyOf(numbers, 4); // copy up to the 4th item
        for (Integer number : copyNumbers) {
            System.out.println(number); // 23 45 21 6
        }

        Integer[] copyRangeNumbers = Arrays.copyOfRange(numbers, 2, numbers.length); // from 3rd to the last
        for (Integer number : copyRangeNumbers) {
            System.out.println(number); // 21, 6, 34, 90
        }

        Arrays.sort(numbers);
        int index = Arrays.binarySearch(numbers, 34);
        System.out.println(index);
        System.out.println(numbers.length); // 6

        List<Integer> numberList = Arrays.asList(numbers); // Array to List
        System.out.println(numberList.size()); // 6
        System.out.println(numberList);

        int[][] array1 = { { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] array2 = { { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] array3 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println(Arrays.deepEquals(array1, array2)); // true
        System.out.println(Arrays.deepEquals(array1, array3)); // false
        System.out.println(Arrays.equals(array2, array3)); // false
        System.out.println(Arrays.toString(numbers));

        int[] evenNumbersFromZeroToTen = new int[6];
        Arrays.setAll(evenNumbersFromZeroToTen, i -> i * 2);
        System.out.println(Arrays.toString(evenNumbersFromZeroToTen));

        int[] oddNumbersFromOneToNine = new int[5];
        Arrays.setAll(oddNumbersFromOneToNine, i -> (i * 2) + 1); // [0, 2, 4, 6, 8, 10]
        System.out.println(Arrays.toString(oddNumbersFromOneToNine)); // [1, 3, 5, 7, 9]

        int[] arrayToFill = { 23, 45, 31, 9, 56, 32 };
        Arrays.fill(arrayToFill, 3, 4, 3);
        System.out.println(Arrays.toString(arrayToFill)); // [23, 45, 31, 3, 56, 32]

    }
}