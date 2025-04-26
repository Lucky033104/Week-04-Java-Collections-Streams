package AdvProblems;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.text.*;
import java.util.*;

public class DateFormatter {
    public String formatDate(String inputDate) {
        try {
            SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat outputFormat = new SimpleDateFormat("dd-MM-yyyy");
            Date date = inputFormat.parse(inputDate);
            return outputFormat.format(date);
        } catch (ParseException e) {
            throw new IllegalArgumentException("Invalid date format");
        }
    }
    public static class DateFormatterTest {
        private DateFormatter dateFormatter;
        @BeforeEach
        public void setup() {
            dateFormatter = new DateFormatter();
        }
        @Test
        public void testValidDate() {
            assertEquals("25-12-2023", dateFormatter.formatDate("2023-12-25"));
        }
        @Test
        public void testInvalidDateFormat() {
            assertThrows(IllegalArgumentException.class, () -> dateFormatter.formatDate("12/25/2023"));
        }
        @Test
        public void testEmptyDate() {
            assertThrows(IllegalArgumentException.class, () -> dateFormatter.formatDate(""));
        }
        @Test
        public void testDateWithInvalidMonth() {
            assertThrows(IllegalArgumentException.class, () -> dateFormatter.formatDate("2023-13-25"));
        }
        @Test
        public void testDateWithInvalidDay() {
            assertThrows(IllegalArgumentException.class, () -> dateFormatter.formatDate("2023-02-30"));
        }
    }
}

