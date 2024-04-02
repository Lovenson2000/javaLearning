import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {

    public static void main(String[] args) {
        File file = new File("/Users/lovensonbeaucicot/desktop/text.txt");
        int wordCount = 0;
        int MIN_WORDS = 1000;

        try {
            if (file.exists() && file.canRead()) {
                try (Scanner reader = new Scanner(file)) {
                    while (reader.hasNextLine()) {
                        String line = reader.nextLine();
                        String[] wordsInCurrentLine = line.split(" ");
                        wordCount += wordsInCurrentLine.length;
                        System.out.println(line);
                    }
                }
                System.out.println(
                        file.getName() + " contains " + wordCount + " words. Still missing " + (MIN_WORDS - wordCount));
            } else {
                System.out.println("File does not exist or cannot be read");
            }
        } catch (FileNotFoundException error) {
            System.out.println("File does not exist");
            error.printStackTrace();
        }
    }
}
