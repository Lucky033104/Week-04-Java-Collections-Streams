package AdvancedProblems;
import java.util.regex.*;
import java.util.*;

public class LanguageExtract {
    public static List<String> extractLanguages(String text) {
        List<String> languages = new ArrayList<>();
        String pattern = "\\b(Java|Python|JavaScript|Go|C\\+\\+|C|Ruby|PHP|Swift|Kotlin|Rust|R)\\b";
        Matcher matcher = Pattern.compile(pattern).matcher(text);
        while (matcher.find()) {
            languages.add(matcher.group());
        }
        return languages;
    }
    public static void main(String[] args) {
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        List<String> languageList = extractLanguages(text);
        for (String language : languageList) {
            System.out.println(language);
        }
    }
}

