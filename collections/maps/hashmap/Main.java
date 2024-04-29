package collections.maps.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map <String, Integer> people = new HashMap<>();
        Map <String, Integer> otherPeople = new HashMap<>(Map.of("Wado", 34, "Jeff-G", 20));

        people.put("Blatter", 23);
        people.putAll(otherPeople);
        System.out.println(people);
        
    }
}