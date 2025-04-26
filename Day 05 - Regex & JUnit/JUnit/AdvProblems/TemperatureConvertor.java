package AdvProblems;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class TemperatureConverter {
    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    public static class TemperatureConverterTest {
        private TemperatureConverter converter;
        @BeforeEach
        public void setup() {
            converter = new TemperatureConverter();
        }
        @Test
        public void testCelsiusToFahrenheit() {
            assertEquals(32, converter.celsiusToFahrenheit(0), 0.001);
            assertEquals(212, converter.celsiusToFahrenheit(100), 0.001);
        }
        @Test
        public void testFahrenheitToCelsius() {
            assertEquals(0, converter.fahrenheitToCelsius(32), 0.001);
            assertEquals(100, converter.fahrenheitToCelsius(212), 0.001);
        }
        @Test
        public void testRoundTripConversion() {
            double celsius = 37.5;
            double fahrenheit = converter.celsiusToFahrenheit(celsius);
            assertEquals(celsius, converter.fahrenheitToCelsius(fahrenheit), 0.001);
        }
    }
}

