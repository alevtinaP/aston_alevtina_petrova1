package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Employee[] employeeArray = new Employee[5];


        employeeArray[0] = new Employee("Петрова Алевтина Сергеевна", "Продавецr", "van@mail.ru", "+1234544489", 500, 30);
        employeeArray[1] = new Employee("Бутенко Ольга Ивановна", "Менеджер", "van1@mail.ru", "+55555555", 600, 35);
        employeeArray[2] = new Employee("Карпик Виталий Александрович", "Воспитатель", "ivan6@mail.ru", "+55555553", 500, 28);
        employeeArray[3] = new Employee("Иванова Юлия Александровна", "Дизайнер", "ivan7@mail.ru", "+5555454545", 400, 25);
        employeeArray[4] = new Employee("Козлов Сергей Иванович", "Врач", "sivan@mail.ru", "+37554255", 500, 33);

        for (int i = 0; i < 5; i++) {
            employeeArray[i].employeePrintInfo();
        }


        Park parkGrodno = new Park();
        Park.Attraction atr1 = parkGrodno.new Attraction("Солнышко", "10.00 - 18,00", 5);
        Park.Attraction atr2 = parkGrodno.new Attraction("Машинки", "10.00 - 18,00", 6);

        System.out.println();
        atr1.printInfo();
        System.out.println();
        atr2.printInfo();


    }
}