import jdk.jfr.Description;
import org.example.Factorial;
import org.junit.jupiter.api.Test;

import static org.example.Factorial.calculateFactorial;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest {

    @Test
    public void testCalculateFactorialPositive() {
        int number = 5;
        int expectedFactorial = 120;
        int actualFactorial = calculateFactorial(number);
        assertEquals(expectedFactorial, actualFactorial);
    }

    @Test
    public void testCalculateFactorialNegative() {
        int number = 5;
        int expectedFactorial = 121;
        int actualFactorial = calculateFactorial(number);
        assertEquals(expectedFactorial, actualFactorial);
    }

    @Test
    @Description("факториал числа 0")
    public void testCalculateFactorialZero() {
        int number = 0;
        int expectedFactorial = 1;
        int actualFactorial = calculateFactorial(number);
        assertEquals(expectedFactorial, actualFactorial);
    }
}
