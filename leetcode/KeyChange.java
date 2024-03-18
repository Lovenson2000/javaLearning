package leetcode;

public class KeyChange {

    static int countKeyChanges(String s) {
        String letters = s.toLowerCase();
        int keyChangeCounter = 0;

        for (int i = 1; i < letters.length() - 1; i++) {
            if (letters.charAt(i) != letters.charAt(i - 1)) {
                keyChangeCounter++;
            }
        }
        return keyChangeCounter;
    }

    public static void main(String[] args) {
        System.out.println(countKeyChanges("AaAaAaaA"));

    }
}

// static int countKeyChanges(String s) {
// String[] letters = s.split("");
// int keyChangeCounter = 0;

// for (int i = 0; i < letters.length - 1; i++) {
// if (letters[i].equalsIgnoreCase(letters[i + 1])) {
// continue;
// } else {
// keyChangeCounter++;
// }
// }
// return keyChangeCounter;
// }