package AdvProblems;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccount {
    private double balance;
    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }
    public void withdraw(double amount) {
        if (amount <= balance && amount > 0) balance -= amount;
        else throw new IllegalArgumentException("Insufficient funds");
    }
    public double getBalance() {
        return balance;
    }
    public static class BankAccountTest {
        private BankAccount account;
        @BeforeEach
        public void setup() {
            account = new BankAccount();
        }
        @Test
        public void testDepositIncreasesBalance() {
            account.deposit(100);
            assertEquals(100, account.getBalance());
        }
        @Test
        public void testWithdrawDecreasesBalance() {
            account.deposit(200);
            account.withdraw(50);
            assertEquals(150, account.getBalance());
        }
        @Test
        public void testWithdrawMoreThanBalanceThrowsException() {
            account.deposit(100);
            assertThrows(IllegalArgumentException.class, () -> account.withdraw(150));
        }
        @Test
        public void testInitialBalanceIsZero() {
            assertEquals(0, account.getBalance());
        }
    }
}

