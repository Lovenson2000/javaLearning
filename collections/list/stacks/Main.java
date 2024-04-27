package collections.list.stacks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;


public class Main {

    static <T extends Comparable<T>> Stack<T> sort(Stack<T> stack) {
        ArrayList<T> list = new ArrayList<>(stack);
        Collections.sort(list);
        Stack<T> sortedStack = new Stack<>();
        sortedStack.addAll(list);
        return sortedStack;
    }

    static <T extends Comparable <T>> Stack<T> reverse(Stack<T> stack) {
        ArrayList <T> list = new ArrayList<>(stack);
        Collections.reverse(list);
        Stack<T> reversedStack = new Stack<>();
        reversedStack.addAll(list);
        return reversedStack;
    }

    static <T> boolean isEmpty(Stack<T> stack) {
        return stack.size() == 0;
    }

    public static void main(String[] args) {
        Stack<String> countries = new Stack<>();

        countries.push("Haiti");
        countries.addAll(Arrays.asList("Spain", "Taiwan", "USA", "Scotland", "Austria", "Poland"));

        ArrayList<String> countriesEndInLand = new ArrayList<>();
        countries.forEach((country) -> {
            if (country.contains("land")) {
                countriesEndInLand.add(country);
            }
        });

        countries.pop(); // Removing last element

        System.out.print("Countries that end in \"land\": ");
        countriesEndInLand.forEach(country -> {
            System.out.print(country + " ");
        });
        System.out.println();

        System.out.println("Number of elements in the stack: " + countries.size());
        System.out.println("Stack before sorting: " + countries);

        countries = sort(countries);
        System.out.println("Stack after sorting: " + countries);
        countries = reverse(countries);
        System.out.println("Stack after sorting and reversing: " + countries);


        // Removing longer than 5 letters
        countries.removeIf(country -> (country.length() > 5));
        System.out.print("Countries with fewer letters than five: ");
        countries.forEach(country -> {
            System.out.print(country + " ");
        });
        System.out.println();

        Stack <Integer> numbers = new Stack<>();
        numbers.addAll(Arrays.asList(76, 87, 17, 23, 34));

        System.out.println(numbers.search(87)); // 4 distance from the top
        numbers = sort(numbers);
        numbers = reverse(numbers);
        System.out.println(numbers.search(87)); // 1


        System.out.print("Sorted and Reversed Numbers : ");
        numbers.forEach(number -> {
            System.out.print(number + " ");
        });
        System.out.println();

        System.out.println("Is Number Stack empty ? " + isEmpty(numbers));
    }
}