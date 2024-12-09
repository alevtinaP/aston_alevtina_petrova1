package org.example;

public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String fullName, String position, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    void employeePrintInfo() {
        System.out.println();
        System.out.println("ФИО: " + fullName + ", Должность: " + position + ", Email: " + email +
                ", Телефон: " + phone + ", ЗП: " + salary + ", Возраст: " + age);
    }

}
