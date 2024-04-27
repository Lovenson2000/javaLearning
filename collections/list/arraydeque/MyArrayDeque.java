package collections.list.arraydeque;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class MyArrayDeque {

    // Implemtning some generic custom ArrayDeque Methods
    static <T> ArrayDeque<T> clone(ArrayDeque<T> arrayDeque) {
        ArrayDeque<T> cloneArrayDeque = new ArrayDeque<>();
        arrayDeque.forEach(cloneArrayDeque::add);
        return cloneArrayDeque;
    }

    static <T extends Comparable<T>> ArrayDeque<T> sort(ArrayDeque<T> arrayDeque) {
        ArrayList<T> list = new ArrayList<>(arrayDeque);
        Collections.sort(list);
        return new ArrayDeque<>(list);
    }

    static <T extends Comparable<T>> ArrayDeque<T> reverse(ArrayDeque<T> arrayDeque) {
        ArrayList<T> list = new ArrayList<>(arrayDeque);
        Collections.reverse(list);
        return new ArrayDeque<>(list);
    }

    static <T extends Comparable<T>> int search(ArrayDeque<T> arrayDeque, T target) {
        int index = 0;
        for (T element : arrayDeque) {
            if (element.compareTo(target) == 0) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public static void main(String[] args) {
        ArrayDeque<String> animals = new ArrayDeque<>();

        animals.addFirst("Dog");
        animals.addAll(Arrays.asList("Cat", "Goat", "Chicken"));
        animals.addLast("Snake");

        ArrayDeque<String> copy = clone(animals);
        System.out.println(animals);
        System.out.println(copy);

        System.out.println("Size is: " + animals.size());

        int index = search(copy, "Cat");
        System.out.println(index);

        animals = reverse(animals);
        System.out.print("Reversed Animals: ");
        animals.forEach(animal -> {
            System.out.print(animal + " ");
        });

        System.out.println();

        animals = sort(animals);
        System.out.print("Sorted Animals: ");
        animals.forEach(animal -> {
            System.out.print(animal + " ");
        });
    }
}
