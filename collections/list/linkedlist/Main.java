import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList <String> names = new LinkedList<>();

        //Adding elements
        names.addAll(Arrays.asList("Blatter", "Wado", "Ander", "Luka", "Jeff", "Adidas"));
        System.out.println(names.getFirst());
        System.out.println(names.getLast());
        System.out.println(names.get(2));
        System.out.println(names.indexOf("Ander"));
        System.out.println(names.offer("Toni"));
        names.pop();
        names.poll();
        names.offerLast("Blatter");
        System.out.println(names);

        String[] otherNames = names.toArray(new String[names.size()]);

        Collections.sort(names);
        System.out.println(names);
        Collections.reverse(names);
        System.out.println(names);

        ArrayList<String> namesShorterThanBlatter = new ArrayList<>();

        Iterator <String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            if (name.length() < "Blatter".length()) {
                namesShorterThanBlatter.add(name);   
            } 
        }
        System.out.println("Names shorter than Blatter: " + namesShorterThanBlatter);


        Iterator <String> name = names.iterator();
        while (name.hasNext()) {
            System.out.print(name.next().toUpperCase());
            System.out.print(", ");
        }
        
    }
}
