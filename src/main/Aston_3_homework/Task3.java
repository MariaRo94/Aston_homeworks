package Aston_3_homework;/*Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте ее любым значением.
        Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение “Красный”, если лежит в
        пределах от 0 (0 исключительно) до 100 (100 включительно),
        то “Желтый”, если больше 100 (100 исключительно) - “Зеленый”;*/

public class Task3 {
    public static void main(String[] args) {
        printColor();
    }

    public static void printColor() {
        int value = 87;
        if (value <=0) {
            System.out.println("Красный");
        }
        else if (value >=0 && value<=100) {
            System.out.println("Желтый");
        }
        else if (value >= 100) {
            System.out.println("Зеленый");
        }
    }
}
