package AdvancedProblems;
import java.util.regex.*;
import java.util.*;

public class CurrencyExtract {
    public static List<String> extractCurrencies(String text) {
        List<String> currencies = new ArrayList<>();
        String pattern = "(\\$?\\d+(?:\\.\\d{1,2})?)";
        Matcher matcher = Pattern.compile(pattern).matcher(text);
        while (matcher.find()) {
            currencies.add(matcher.group());
        }
        return currencies;
    }
    public static void main(String[] args) {
        String text = "The price is $45.99, and the discount is 10.50.";
        List<String> currencyList = extractCurrencies(text);
        for (String currency : currencyList) {
            System.out.println(currency);
        }
    }
}

