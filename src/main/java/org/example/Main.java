package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumber();
        sumInRange (5, 7);
        compareNumberNegative(0);
        negboolean(-12);
        printStringNumber("Alevtna_Petrova", 10);
        leapYear();
        array0to1 ();
        array100 ();
        arrayx2 ();
        arrayDiagonal ();
        initialValueArr(5 ,9);
    }

    //задание 1
    public static void printThreeWords() {
        System.out.println();
        System.out.println("***задание 1***");
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    //задание 2
    public static void checkSumSign() {
        System.out.println();
        System.out.println("***задание2***");
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
        System.out.println();
        System.out.println("***задание3***");
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
        System.out.println();
        System.out.println("***задание4***");
        int a = 1;
        int b = 20;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");

        }
    }

    //задание 5
    public static void sumInRange (int a, int b) {
        System.out.println();
        System.out.println("***задание5***");

        boolean answerBoolean = true;
        int sum = a + b;

        if ((sum >= 10) && (sum <= 20)) {
            System.out.println(a + " + " + b + " = " + sum + " сумма лежит в пределах от 10 до 20 (включительно) - answerBoolean = " + answerBoolean);
        } else {
            answerBoolean = false;
            System.out.println(a + " + " + b + " = " + sum + " сумма НЕ лежит в пределах от 10 до 20 (включительно) - answerBoolean = " + answerBoolean);
        }

    }


    //задание 6
    public static void compareNumberNegative(int w) {
        System.out.println();
        System.out.println("***задание6***");
        if (w >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");

        }
    }

    //задание 7
    public static void negboolean(int number) {
        System.out.println();
        System.out.println("***задание7***");

        boolean answer = true;
        if (number >= 0) {
            answer = false;
            System.out.println(number + " положительное число = " + answer);}
        else {
            answer = true;
            System.out.println(number + " отрицательное число = " + answer);}
    }


       //задание 8
       public static void printStringNumber(String inputString, int count) {
           System.out.println();
           System.out.println("***задание8***");
           for (int i = 0; i < count; i++) {
               System.out.println(inputString);
           }
       }

       //задание 9
        public static void leapYear() {
            System.out.println();
            System.out.println("***задание9***");

        int year = 2024;
        boolean ans = true;

        if ((year % 4 == 0) && (year % 100 != 0)) {

            ans = true;
            System.out.print(year + " Это високосный год answer =  " + ans);}
        else {
            if (year % 400 == 0){
                ans = true;
                System.out.print(year + "Это високосный год answer = " + ans);}

            else {
                ans = false;
                System.out.print(year + " Это не високосный год answer =  " + ans);
            }
        }
    }


        //задание 10
        public static void array0to1 () {
            System.out.println();
            System.out.println();
            System.out.println("***задание10***");
            int [] arr = {0,1,0,1,0,1,1,1,1,1};

            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+ " ");

            }
            System.out.println();
            for ( int i = 0; i < arr.length; i++) {

                if (arr[i] == 0) {
                    arr[i] = 1;
                } else  arr[i] = 0;

                System.out.print(arr[i]+" ");
            }
        }


    //задание 11
    public static void array100 () {
        System.out.println();
        System.out.println();
        System.out.println("***задание11***");
        int [] arr = new int[100];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=i + 1;
            System.out.print(arr[i]+ " ");
        }

    }

    //задание 12
    public static void arrayx2 () {
        System.out.println();
        System.out.println();
        System.out.println("***задание12***");
        int [] arr = {1,5,3,2,11,4,5,2,4,8,9,1};

        for (int i = 0; i < arr.length; i++)
        System.out.print(arr[i]+ " ");
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            } else arr[i] = arr[i];


            System.out.print(arr[i]+ " ");
        }

    }

    //задание 13
    public static void arrayDiagonal () {
        System.out.println();
        System.out.println();
        System.out.println("***задание13***");
        int n = 10;
        int [][] arr = new int [n][n];


        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
                else {
                    arr[i][j] = 0;}
                System.out.print(  arr[i][j] + "  ");
            }
            System.out.println();
        }

    }

    //задание 14
    public static void initialValueArr(int len ,int initialValue) {
        System.out.println();
        System.out.println("***задание14***");

        int[] myArray = new int[len];
        for (int i = 0; i < len; i++) {
            myArray[i] = initialValue;
            System.out.println( "element " + i + " =  " + myArray[i]);
        }
    }

}


