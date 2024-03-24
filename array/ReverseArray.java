package array;

import java.lang.reflect.Array;

public class ReverseArray {

    public static <T> T[] reverseArray(T[] array, Class<T> type) {

        T[] reversedArray = (T[]) Array.newInstance(type, array.length);
        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - 1 - i];
        }
        return reversedArray;
    }

    public static <T> T[] reverseArrayWithWhileLoop(T[] array) {
        int start = 0;
        int end = array.length - 1;

        while (end > start) {
            T tempValue = array[start];
            array[start] = array[end];
            array[end] = tempValue;
            start++;
            end--;
        }
        return array;
    }

    public static void main(String[] args) {
        Integer[] numbers = { 34, 23, 23, 98, 12 };
        String[] words = { "school", "university", "soccer", "car" };
        // String[] reversedWords = reverseArrayWithWhileLoop(words);
        Integer[] reversedNumbers = reverseArrayWithWhileLoop(numbers);
        // Integer[] reversedNumbers = reverseArray(numbers, Integer.class);
        String[] reversedWords = reverseArray(words, String.class);

        System.out.println("Reversed Numbers: ");
        for (int i : reversedNumbers) {
            System.out.print(i + " ");
        }
        System.out.println("\nReversed Words: ");
        for (String word : reversedWords) {
            System.out.print(word + " ");

        }
    }
}