package AdvancedProblems;
import java.util.regex.*;

public class CreditCard {
    public static boolean isValidCreditCard(String cardNumber) {
        String visaPattern = "^4\\d{15}$";
        String masterCardPattern = "^5\\d{15}$";
        return Pattern.matches(visaPattern, cardNumber) || Pattern.matches(masterCardPattern, cardNumber);
    }
    public static void main(String[] args) {
        System.out.println(isValidCreditCard("4111111111111111"));  
        System.out.println(isValidCreditCard("5111111111111111")); 
        System.out.println(isValidCreditCard("411111111111"));    
        System.out.println(isValidCreditCard("6111111111111111"));   
        System.out.println(isValidCreditCard("51111111111111111"));  
    }
}

