package Exceptions;

import java.util.Scanner;
class InsufficientBalanceException extends Exception {
 public InsufficientBalanceException(String message) {
     super(message);
 }
}
public class BankTransaction {
 private double balance;
 public BankTransaction(double balance) {
     this.balance = balance;
 }
 public void withdraw(double amount) throws InsufficientBalanceException {
     if (amount < 0) {
         throw new IllegalArgumentException("Invalid amount!");
     }
     if (amount > balance) {
         throw new InsufficientBalanceException("Insufficient balance!");
     }
     balance -= amount;
     System.out.println("Withdrawal successful, new balance: " + balance);
 }
 public static void main(String[] args) {
     BankTransaction account = new BankTransaction(1000.0);
     Scanner scanner = new Scanner(System.in);
     try {
         System.out.print("Enter amount: ");
         double amount = scanner.nextDouble();
         account.withdraw(amount);
     } catch (IllegalArgumentException e) {
         System.out.println(e.getMessage());
     } catch (InsufficientBalanceException e) {
    	 System.out.println(e.getMessage());
     } finally {
         scanner.close();
     }
 }
}
