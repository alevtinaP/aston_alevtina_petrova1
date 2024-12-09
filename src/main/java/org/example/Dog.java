package org.example;

public class Dog extends Animal {
    private String name;
    private int jumpM;
    private int swimM;
    static int countDog = 0;

    public Dog(String name, int jumpM, int swimM) {
        this.name = name;
        this.jumpM = jumpM;
        this.swimM = swimM;
        countDog++;
    }

    public static int getCount() {
        return countDog;
    }


    @Override
    public void run(int distance) {
        if (distance <= 500) {
            System.out.println("Собака по имени " + name + " пробежала " + distance + " м.");
        } else System.out.println("Собака по имени " + name + " НЕ пробежала " + distance + " м.");
    }

    @Override
    public void swim(int distance) {
        if (distance <= 10) {
            System.out.println("Собака по имени " + name + " проплыла " + distance + " м.");
        } else System.out.println("Собака по имени " + name + " НЕ проплыла " + distance + " м.");

    }
}
