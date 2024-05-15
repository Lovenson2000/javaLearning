package collections.maps.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        HashMap <String, Integer> people = new HashMap<>();
        HashMap <String, Integer> otherPeople = new HashMap<>(Map.of("Wado", 26, "Jeff-G", 20, "Adidas", 30));

        // Adding elements to a hashmap
        people.put("Blatter", 23);
        // people.putAll(otherPeople);
        otherPeople.putIfAbsent("Blatter", 23); // won't be added
        otherPeople.forEach((key, value) -> people.merge(key, value, (oldValue, newValue) -> oldValue + oldValue));
        System.out.println(people);

        // Most common methods
        System.out.println(people.values());
        System.out.println(people.keySet());
        System.out.println(people.entrySet());
        System.out.println(people.get("Wado"));
        System.out.println(people.containsKey("Adidas")); // true
        System.out.println(people.containsValue(23)); // true
        
    }
}