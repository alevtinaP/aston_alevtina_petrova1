package org.example;

public class Employee {
    String name;
    String lastname;
    String middlename;
    String position;
    String email;
    String phone;
    int salary;
    int age;

    // Конструктор класса
    public Employee(String name,String lastname,String middlename, String position, String email, String phone, int salary, int age  ){
        this.name = name;
        this.lastname = lastname;
        this.middlename = middlename;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
        



    }

    // Метод для вывода информации об объекте в консоль
void printInfo() {
    System.out.println();
    System.out.println("Фамилия: " + lastname + ", Имя: " + name + ", Отчесто: " + middlename + ", Должность: " + position + ", Email: " + email +
            ", Телефон: " + phone + ", ЗП: " + salary + ", Возраст: " + age);
}

}
