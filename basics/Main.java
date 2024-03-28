import java.time.Duration;
import java.time.Instant;

public class Main {

    public int linearSearch(int[] array, int target) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                index = i;
            }
        }
        return index;
    }

    public int binarySearch(int[] array, int target) {

        int start = 0;
        int end = array.length - 1;

        while (start < end) {

            int middle = start + (end - start) / 2;

            if (array[middle] == target) {
                return middle;
            } else if (array[middle] < target) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] numbers = { 2, 4, 7, 10, 13, 16, 19, 22, 25, 28, 31, 34, 37, 40, 43, 46, 49, 52, 55, 58, 61, 64, 67, 70,
                73, 76, 87, 98, 123, 124, 130, 169, 175, 178, 180, 200, 220 };

        Main example = new Main();

        Instant LINEAR_SEARCH_START_TIME = Instant.now();
        System.out.println("Index found by linear search: " + example.linearSearch(numbers, 55));
        Instant LINEAR_SEARCH_END_TIME = Instant.now();
        Duration LINEAR_SEARCH_EXECUTION_TIME = Duration.between(LINEAR_SEARCH_START_TIME, LINEAR_SEARCH_END_TIME);
        System.out.println("Linear search execution time: " + LINEAR_SEARCH_EXECUTION_TIME.toNanos() + " nanoseconds");

        Instant BINARY_SEARCH_START_TIME = Instant.now();
        System.out.println("Index found by binary search: " + example.binarySearch(numbers, 55));
        Instant BINARY_SEARCH_END_TIME = Instant.now();
        Duration BINARY_SEARCH_EXECUTION_TIME = Duration.between(BINARY_SEARCH_START_TIME, BINARY_SEARCH_END_TIME);
        System.out.println("Binary search execution time: " + BINARY_SEARCH_EXECUTION_TIME.toNanos() + " nanoseconds");

    }
}