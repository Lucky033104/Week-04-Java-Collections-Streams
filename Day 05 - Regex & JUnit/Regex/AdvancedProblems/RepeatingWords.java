package AdvancedProblems;
import java.util.regex.*;
import java.util.*;

public class RepeatingWords{
    public static List<String> findRepeatingWords(String text) {
        List<String> repeatingWords = new ArrayList<>();
        Set<String> seenWords = new HashSet<>();
        Pattern pattern = Pattern.compile("\\b(\\w+)\\b");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            String word = matcher.group(1).toLowerCase(); 
            if (seenWords.contains(word) && !repeatingWords.contains(word)) {
                repeatingWords.add(word);
            } else {
                seenWords.add(word);
            }
        }
        return repeatingWords;
    }
    public static void main(String[] args) {
        String text = "This is is a repeated repeated word test.";
        List<String> repeatingWords = findRepeatingWords(text);
        for (String word : repeatingWords) {
            System.out.println(word);
        }
    }
}

