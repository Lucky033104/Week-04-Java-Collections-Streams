package BasicProblems;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double) a / b;
    }

    public static class CalculatorTest {

        private Calculator calculator;

        @BeforeEach
        public void setUp() {
            calculator = new Calculator();
        }

        @Test
        public void testAdd() {
            assertEquals(5, calculator.add(2, 3));
        }

        @Test
        public void testSubtract() {
            assertEquals(1, calculator.subtract(3, 2));
        }

        @Test
        public void testMultiply() {
            assertEquals(6, calculator.multiply(2, 3));
        }

        @Test
        public void testDivide() {
            assertEquals(2.5, calculator.divide(5, 2));
        }

        @Test
        public void testDivideByZero() {
            ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
                calculator.divide(5, 0);
            });
            assertEquals("Cannot divide by zero", exception.getMessage());
        }
    }
}

