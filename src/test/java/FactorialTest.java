import org.testng.Assert;
import org.testng.annotations.Test;

import static org.example.Factorial.calculateFactorial;

public class FactorialTest {

    @Test
    public void testCalculateFactorialPositive() {
        int number = 5;
        int expectedFactorial = 120;
        int actualFactorial = calculateFactorial(number);
        Assert.assertEquals(actualFactorial, expectedFactorial);

    }

    @Test
    public void testCalculateFactorialNegative() {
        int number = 5;
        int expectedFactorial = 121;
        int actualFactorial = calculateFactorial(number);
        Assert.assertEquals(actualFactorial, expectedFactorial);
    }

    @Test(description = "факториал числа 0")
    public void testCalculateFactorialZero() {
        int number = 0;
        int expectedFactorial = 1;
        int actualFactorial = calculateFactorial(number);
        Assert.assertEquals(actualFactorial, expectedFactorial);
    }
}
