package AdvancedProblems;
import java.util.regex.*;

public class IPAddressValidate {
    public static boolean isValidIPv4(String ip) {
        String pattern = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}" + "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
        return Pattern.matches(pattern, ip);
    }
    public static void main(String[] args) {
        System.out.println(isValidIPv4("192.168.1.1"));    
        System.out.println(isValidIPv4("256.256.256.256"));  
        System.out.println(isValidIPv4("10.0.0.255"));      
        System.out.println(isValidIPv4("127.0.0.1"));       
        System.out.println(isValidIPv4("192.168.1.300"));   
    }
}

