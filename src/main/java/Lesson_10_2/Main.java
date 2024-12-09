package Lesson_10_2;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(8, "Желтый", "Черный");
        Shape rectangle = new Rectangle(3, 6, "Синий", "Черный");
        Shape triangle = new Triangle(3, 5, 5, "Розовый", "Синий");

        printShapeDetails(circle);
        printShapeDetails(rectangle);
        printShapeDetails(triangle);
    }

    public static void printShapeDetails(Shape shape) {
        System.out.println("Периметр: " + shape.getPerimeter());
        System.out.println("Площадь: " + shape.getArea());
        System.out.println("Цвет заливки: " + shape.getFillColor());
        System.out.println("Цвет границы: " + shape.getBorderColor());
        System.out.println();
    }
}