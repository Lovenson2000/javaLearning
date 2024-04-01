import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {

    static int addStringCharacters(String numberString) {

        char[] characters = numberString.toCharArray();
        int sum = 0;

        for (char c : characters) {
            int numericValue = Character.getNumericValue(c);
            if (numericValue >= 0) {
                sum += numericValue;
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        System.out.println(addStringCharacters("123456")); // 21

        String name = "Blatter";
        char[] lettersInName = new char[name.length()];
        name.getChars(0, name.length(), lettersInName, 0);

        String emptyStringWithWhitespaces = "   ";
        String text = "I was learning Java";

        char[] letters = { 'P', 'r', 'o', 'g', 'r', 'a', 'm' };
        String wordFromLetters = String.copyValueOf(letters, 0, letters.length);
        System.out.println(wordFromLetters);

        System.out.println(lettersInName); // Blatter
        System.out.println(name.hashCode());
        System.out.println(text.replace("was", "am"));
        System.out.println(name.charAt(0));
        System.out.println(name.compareToIgnoreCase("blatter")); // 0 as true
        System.out.println(emptyStringWithWhitespaces.isEmpty()); // false
        System.out.println(emptyStringWithWhitespaces.isBlank()); // true
        System.out.println("FRIEND".equalsIgnoreCase("friend")); // true
        System.out.println("Blatter".contains("ter")); // true

        // Working with String Buffer
        StringBuffer someText = new StringBuffer("Some text");
        StringBuffer anotherText = new StringBuffer("some Text");
        System.out.println(someText.length());
        System.out.println(someText.capacity());
        System.out.println(someText.compareTo(anotherText));

        someText.delete(0, someText.length()); // deleting everything
        someText.ensureCapacity(40);
        someText.append("Some newly added text");
        System.out.println(someText);
        System.out.println(someText.length());

        StringBuffer username = new StringBuffer("Blatter");
        String nameChars = username.chars()
                .mapToObj(c -> (char) c)
                .map(Object::toString)
                .collect(Collectors.joining(" "));

        System.out.println(nameChars); // B l a t t e r

        String stringChars = String.join(" ", username.toString().split(""));
        System.out.println(stringChars); // B l a t t e r
    }

}