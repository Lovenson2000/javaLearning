import java.util.Arrays;

public class BinarySearch {

    static int findIndex(int[] numbers, int target) {

        int left = 0;
        int right = numbers.length - 1;

        while (left <= right) {

            int middle = left + (right - left) / 2;

            if (numbers[middle] == target) {
                return middle;
            } else if (target > numbers[middle]) {
                left = middle + 1;
            } else {

                right = middle - 1;
            }
        }
    }

    public static void main(String[] args) {

        int[] numbers = { 23, 12, 98, 13, 8, 34, 87 };

        int[] sortedNumbers = Arrays.sort(numbers);

    }

}
