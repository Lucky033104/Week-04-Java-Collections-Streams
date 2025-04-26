package AdvancedProblems;

import java.util.regex.*;

public class SSNValidate {
    public static boolean isValidSSN(String ssn) {
        String pattern = "^(?!000|666|9\\d{2})\\d{3}-(?!00)\\d{2}-(?!0000)\\d{4}$";
        return Pattern.matches(pattern, ssn);
    }
    public static void main(String[] args) {
        String ssn1 = "123-45-6789";
        String ssn2 = "123456789";
        System.out.println(isValidSSN(ssn1) ? ssn1 + " is valid" : ssn1 + " is invalid");
        System.out.println(isValidSSN(ssn2) ? ssn2 + " is valid" : ssn2 + " is invalid");
    }
}

