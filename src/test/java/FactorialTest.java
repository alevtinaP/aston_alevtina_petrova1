import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialTest {

    // Метод для вычисления факториала числа
    public static long factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    @Test
    public void testFactorialOfZero() {
        Assert.assertEquals(factorial(0), 1);
    }

    @Test
    public void testFactorialOfOne() {
        Assert.assertEquals(factorial(1), 1);
    }

    @Test
    public void testFactorialOfFive() {
        Assert.assertEquals(factorial(5), 120);
    }

    @Test
    public void testFactorialOfSeven() {
        Assert.assertEquals(factorial(7), 5040);
    }

    @Test
    public void testFactorialOfTen() {
        Assert.assertEquals(factorial(10), 3628800);
    }
}