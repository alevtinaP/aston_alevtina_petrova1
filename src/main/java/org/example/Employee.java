package org.example;

public class Employee {
    String fullName;
    String position;
    String email;
    String phone;
    int salary;
    int age;

    // Конструктор класса
    public Employee(String fullName, String position, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    // Метод для вывода информации об объекте в консоль
    void employeePrintInfo() {
        System.out.println();
        System.out.println("ФИО: " + fullName + ", Должность: " + position + ", Email: " + email +
                ", Телефон: " + phone + ", ЗП: " + salary + ", Возраст: " + age);
    }

}
