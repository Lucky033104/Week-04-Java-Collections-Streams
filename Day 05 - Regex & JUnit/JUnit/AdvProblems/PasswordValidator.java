package AdvProblems;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordValidator {
    public boolean isValid(String password) {
        return password != null &&
               password.length() >= 8 &&
               password.matches(".*[A-Z].*") &&
               password.matches(".*\\d.*");
    }
    public static class PasswordValidatorTest {
        private PasswordValidator validator;
        @BeforeEach
        public void setup() {
            validator = new PasswordValidator();
        }
        @Test
        public void testValidPassword() {
            assertTrue(validator.isValid("Password1"));
        }
        @Test
        public void testShortPassword() {
            assertFalse(validator.isValid("Pas1"));
        }
        @Test
        public void testMissingUppercase() {
            assertFalse(validator.isValid("password1"));
        }
        @Test
        public void testMissingDigit() {
            assertFalse(validator.isValid("Password"));
        }
        @Test
        public void testNullPassword() {
            assertFalse(validator.isValid(null));
        }
    }
}

