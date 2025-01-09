import org.example.Factorial;

public class Main {
    public static void main(String[] args) {
        int number = 5;
        int factorial = Factorial.calculateFactorial(number);
        System.out.println("Факториал числа" + number + " равен " + factorial);
    }
}
