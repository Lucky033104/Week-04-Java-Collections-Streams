package Regex;
import java.util.regex.*;

public class ValidUsernames {
    public static boolean isValidUsername(String username) {
        String pattern = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";
        return Pattern.matches(pattern, username);
    }
    public static void main(String[] args) {
        System.out.println(isValidUsername("user_123")); 
        System.out.println(isValidUsername("123user"));  
        System.out.println(isValidUsername("us"));     
    }
}

