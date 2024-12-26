import org.testng.Assert;
import org.testng.annotations.Test;

public class BaseTest {

    @Test
public void someTest(){
        int a = 3;
        int b = 5;
        int c;
        Assert.assertEquals(a*b, 15, "проверка");


      //  System.out.println("Этот тест запущен");
}
@Test (enabled = false, description =  )
    public void someTest1(){
        int a = 3;
        int b = 5;
        int c;
        Assert.assertEquals(a*b, 10, "проверка");


        //  System.out.println("Этот тест запущен");
    }
}
