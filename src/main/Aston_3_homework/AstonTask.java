package Aston_3_homework;
/*Все 14 задач в одном классе и методе Main. Остальное в репозитории - задачи в разных классах*/
import java.util.Scanner;

public class AstonTask {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        checkNumber(5, 77);
        scanNumber(-5);
        System.out.println(isPositive(7));
        printStr("I love Java", 5);
        System.out.println(leapYear(1994));
        createArray();
        matrix();
        createMatrix();
        int [][] result = doubleArray(10);
        printMatrix(result);
        printArray1(createArray1(5,7));

    }

    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple ");
    }

    public static void checkSumSign() {
        int a = 7;
        int b = -22;
        if (a+b >= 0) {
            System.out.println("Сумма положительная");
        } else System.out.println("Сумма отрицательная");
    }

    public static void printColor() {
        int value = 1111;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value >= 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 9;
        int b = 99;
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }

    }

    public static boolean checkNumber(int a, int b) {
        return a+b >= 10 && a+b <= 20;
    }

    public static void scanNumber(int toScan) {
        if (toScan >= 0) {
            System.out.println("The number is positive");
        } else {
            System.out.println("The number is negative");
        }

    }

    public static boolean isPositive(int a) {
        return a >= 0;
    }

    public static void printStr(String str, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(str);
        }
    }

    public static boolean leapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    public static void createArray() {
        int[] array = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
        }

        for (int j : array) {
            System.out.println(j);
        }
    }

    public static void matrix() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            System.out.println(array[i]);
        }
    }
    public static void createMatrix(){
        System.out.println("Массив после умножения:");
        int [] array = new int [] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length ; i++) {
            if (array[i] < 6){
                array[i]=array[i]*2;
            }
            System.out.println(array[i]);
        }
    }
    public static int[][] doubleArray(int x) {
        int[][] array = new int[x][x];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j] || array[array.length - i - 1] == array[j]) {
                    array[i][j] = 1;
                } else {
                    array[i][j] = 0;
                }
            }
        }
        return array;
    }

    public static void printMatrix(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static int[] createArray1(int len, int initialValue) {
        int array[] = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }

    public static void printArray1(int [] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }
}


