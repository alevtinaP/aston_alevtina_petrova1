package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Employee[] employeeArray = new Employee[5];

        //  создать массив из 5 сотрудников

        employeeArray[0] = new Employee("Петрова Алевтина Сергеевна", "Продавецr", "van@mail.ru", "+1234544489", 500, 30);
        employeeArray[1] = new Employee("Бутенко Ольга Ивановна", "Менеджер", "van1@mail.ru", "+55555555", 600, 35);
        employeeArray[2] = new Employee("Карпик Виталий Александрович", "Воспитатель", "ivan6@mail.ru", "+55555553", 500, 28);
        employeeArray[3] = new Employee("Иванова Юлия Александровна", "Дизайнер", "ivan7@mail.ru", "+5555454545", 400, 25);
        employeeArray[4] = new Employee("Козлов Сергей Иванович", "Врач", "sivan@mail.ru", "+37554255", 500, 33);

        for(int i = 0; i < 5; i++) {
            employeeArray[i].employeePrintInfo();
        }



    Park parkGrodno = new Park();
        parkGrodno.createAndShowAttractions();


    }
 }