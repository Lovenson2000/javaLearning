
public class Main {

    static int addStringCharacters(String numbeString) {

        char[] characters = numbeString.toCharArray();
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

    }

}