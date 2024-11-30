package org.example;

public class Park {

    public class Attraction {
        private String name;
        private String hours;
        private int price;


        public Attraction(String name, String hours, int price) {
            this.name = name;
            this.hours = hours;
            this.price = price;
        }


        public void printInfo() {
            System.out.println("Аттракцион: " + name);
            System.out.println("Время работы: " + hours);
            System.out.println("Цена: " + price);
        }
    }


}



