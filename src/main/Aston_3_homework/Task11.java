package Aston_3_homework;/* Задать пустой целочисленный массив длиной 100.
С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 ... 100;*/

public class Task11 {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            System.out.println(array[i]);
        }
    }
}
