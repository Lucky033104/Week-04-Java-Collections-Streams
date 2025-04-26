package Regex;
import java.util.regex.*;

public class LicensePlate {
    public static boolean isValidPlate(String plate) {
        String pattern = "^[A-Z]{2}\\d{4}$";
        return Pattern.matches(pattern, plate);
    }
    public static void main(String[] args) {
        System.out.println(isValidPlate("AB1234")); 
        System.out.println(isValidPlate("A12345")); 
        System.out.println(isValidPlate("AB12C4")); 
    }
}

