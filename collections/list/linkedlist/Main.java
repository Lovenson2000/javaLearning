import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

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
        
        
        LinkedList <Integer> grades = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter grades: (Enter -1 to stop)");

        int grade;
        while ((grade = scanner.nextInt()) != -1) {
            grades.add(grade);
        }
        scanner.close();

        double gradeAverage = average(grades);
        System.out.println( "Average is: " + gradeAverage);

    }

    public static double average(List<Integer> numbers) {
        int[] sum = {0};
        numbers.forEach(number -> sum[0] += number);
        return (double) sum[0] / numbers.size();    
    }
}
