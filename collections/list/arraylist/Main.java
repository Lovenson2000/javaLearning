import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static ArrayList<String> sortNames(ArrayList<String> names) {
        Collections.sort(names);
        return names;
    }

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Blatter", "Luka", "Jeff"));
        System.out.println(names.size());
        String[] otherNames = { "Wado", "Flaco", "Toni", "Muller" };
        System.out.println(names.equals(Arrays.asList("Blatter", "Jeff", "Luka"))); // false

        // ADDING ELEMENTS
        names.add("Adidas");
        names.add(0, "Ander-G"); // Add at index 0
        names.addAll(0, Arrays.asList(otherNames)); // Adding new array starting from index 0
        System.out.println(names);

        // ACCESSING ELEMENTS
        System.out.println(names.get(0));
        System.out.println(names.contains("Blatter"));
        System.out.println(names.containsAll(Arrays.asList("Blatter", "Wado", "Jeff-G")));
        System.out.println(names.equals(otherNames));
        System.out.println(names.indexOf("Wado"));
        System.out.println(names.isEmpty());
        System.out.println(names.subList(2, 4)); // third and fourth element

        names.forEach((name) -> {
            System.out.println(name.toUpperCase());
        });

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toLowerCase());
        }

        // MODIFYING ELEMENTS
        names.set(0, "Djibi"); // Set first item to "Djibi"
        System.out.println(names);

        // DELETING ELEMENTS
        // names.clear(); // Removing all elements
        String removedName = names.remove(3);
        System.out.println("The deleted name is: " + removedName);

        ArrayList<String> namesWithMoreThanFiveLetters = new ArrayList<>();
        Iterator<String> iterator2 = names.iterator();
        while (iterator2.hasNext()) {
            String name = iterator2.next();
            if (name.length() > 5) {
                namesWithMoreThanFiveLetters.add(name);
            }
        }
        System.out.println("Names with more than five letters: " + namesWithMoreThanFiveLetters);

        // SORTING AND REVERSING ARRAYLIST 
        System.out.println(sortNames(namesWithMoreThanFiveLetters));
        names.sort(Comparator.naturalOrder());
        System.out.println("Sorted names: " + names);
        names.sort(Comparator.reverseOrder());
        System.out.println("Sorted and reversed names: " + names);

        names.retainAll(namesWithMoreThanFiveLetters);
        System.out.println(names);

        
        String[] someLanguages = {"English", "French", "Chinese", "Thai", "Polish",};
        ArrayList <String> languages = new ArrayList<>(Arrays.asList(someLanguages));

        String[] languagesArray = new String[languages.size()];
        languages.toArray(languagesArray);

        for (int i = 0; i < languagesArray.length; i++) {
            System.out.println(languagesArray[i]);   
        }

        String list = languages.toString();
        System.out.println(list);

        languages.removeIf(e -> (e.contains("a"))); // Remove languages that contain "a"
        System.out.println(languages);
    }
}