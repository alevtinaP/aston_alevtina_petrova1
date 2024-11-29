package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("***задание 1***");
        printThreeWords();
        System.out.println();
        System.out.println("***задание 2***");
        checkSumSign();
        System.out.println();
        System.out.println("***задание 3***");
        printColor();
        System.out.println();
        System.out.println("***задание 4***");
        compareNumber();
        System.out.println();
        System.out.println("***задание 5***");
        System.out.println(sumInRange(15, 7));
        System.out.println();
        System.out.println("***задание 6***");
        compareNumberNegative(0);
        System.out.println();
        System.out.println("***задание 7***");
        System.out.println(negboolean(0));
        System.out.println();
        System.out.println("***задание 8***");
        printStringNumber("Alevtna_Petrova", 10);
        System.out.println();
        System.out.println("***задание 9***");
        System.out.println(leapYear(2023));
        System.out.println();
        System.out.println("***задание 10***");
        array0to1();
        System.out.println();
        System.out.println("***задание 11***");
        array100();
        System.out.println();
        System.out.println("***задание 12***");
        arrayx2();
        System.out.println();
        System.out.println("***задание 13***");
        arrayDiagonal();
        System.out.println();
        System.out.println("***задание 14***");
        int[] myArray = initialValueArr(5, 9);
        for (int value : myArray)
        System.out.println(value + " ");

    }

    //задание 1
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    //задание 2
    public static void checkSumSign() {
        int a = 1;
        int b = -20;
        if ((a + b) >= 0) {
            System.out.println("Сумма положительая");
        } else {
            System.out.println("Сумма отрицательная");

        }
    }

    //задание 3
    public static void printColor() {
        int value = 0;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else
            System.out.println("Зеленый");


    }

    //задание 4
    public static void compareNumber() {
        int a = 1;
        int b = 20;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");

        }
    }

    //задание 5
    public static boolean sumInRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;


    }


    //задание 6
    public static void compareNumberNegative(int w) {
        if (w >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");

        }
    }

    //задание 7
    public static boolean negboolean(int number) {
        return number < 0;

    }


    //задание 8
    public static void printStringNumber(String inputString, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(inputString);
        }
    }

    //задание 9
    public static boolean leapYear(int year) {
//        int year = 2024;
//        boolean ans = true;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        }
        return false;
    }


    //задание 10
    public static void array0to1() {
        int[] arr = {0, 1, 0, 1, 0, 1, 1, 1, 1, 1};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 0) {
                arr[i] = 1;
            } else arr[i] = 0;

            System.out.print(arr[i] + " ");
        }
    }


    //задание 11
    public static void array100() {
        int[] arr = new int[100];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }

    }

    //задание 12
    public static void arrayx2() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            } else arr[i] = arr[i];


            System.out.print(arr[i] + " ");
        }

    }

    //задание 13
    public static void arrayDiagonal() {
        int n = 10;
        int[][] arr = new int[n][n];


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = 0;
                }
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }

    }

    //задание 14
    public static int[] initialValueArr(int len, int initialValue) {

        int[] myArray = new int[len];
        for (int i = 0; i < len; i++) {
            myArray[i] = initialValue;
           // System.out.println("element " + i + " =  " + myArray[i]);
        }
        return myArray;
    }

}


