package collections.maps.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Main {

    static <K, V> HashMap<K, V> clone(HashMap<K, V> map) {
        return new HashMap<>(map);
    }

    public static void main(String[] args) {
        HashMap <String, Integer> people = new HashMap<>();
        HashMap <String, Integer> otherPeople = new HashMap<>(Map.of("Wado", 26, "Jeff-G", 20, "Adidas", 30));
        HashMap <String, Integer> copyPeople = new HashMap<>();

        // Adding elements to a hashmap
        people.put("Blatter", 23);
        people.putAll(otherPeople);
        people.putIfAbsent("Blatter", 23); // won't be added
        copyPeople = clone(people);

        // Most common methods
        System.out.println(people.values());
        System.out.println(people.keySet());
        System.out.println(people.entrySet());
        System.out.println(copyPeople.get("Wado"));

        
    }
}