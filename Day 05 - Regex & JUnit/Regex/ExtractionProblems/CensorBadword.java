package ExtractionProblems;
import java.util.regex.*;

public class CensorBadword {
    public static String censorBadWords(String text, String[] badWords) {
        for (String word : badWords) {
            String regex = "\\b" + Pattern.quote(word) + "\\b";
            text = text.replaceAll(regex, "****");
        }
        return text;
    }
    public static void main(String[] args) {
        String input = "This is a damn bad example with some stupid words.";
        String[] badWords = {"damn", "stupid"};
        String censored = censorBadWords(input, badWords);
        System.out.println(censored);
    }
}

