import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Blatter", "Luka", "Jeff")); 
        System.out.println(names.size());
        String[] otherNames = {"Wado", "Flaco", "Toni"}; 
        // ADDING ELEMENTS
        names.add("Adidas");
        names.add(0, "Ander-G"); // Add at index 0
        names.addAll(0, Arrays.asList(otherNames)); // Adding new array starting from index 0
        System.out.println(names);

        // ACCESSING ELEMENTS
        System.out.println(names.get(0)); // getting the first item
        System.out.println(names.contains("Blatter")); // true

        names.forEach((name) -> {
            name = name.toUpperCase();
            System.out.println(name);
        });

        Iterator <String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toLowerCase()); 
        }
    }
}