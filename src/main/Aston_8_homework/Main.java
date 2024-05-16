package Aston_8_homework;

public class Main {
    public static void main(String[] args) {
        //Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4.
        // При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
        String[][] correct = new String[4][4];
        String[][] wrongFirst = new String[5][4];
        String[][] wrongSecond = new String[4][5];
        String[][] wrongAll = new String[5][5];
        arrayChecker(correct);
        try {
            arrayChecker(wrongFirst);
            arrayChecker(wrongSecond);
            arrayChecker(wrongAll);
        } catch (MyArraySizeException e) {
            System.out.println("got a MyArraySizeException");
        }

        //Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
        // Если в каком-то элементе массива преобразование не удалось (например,
        // в ячейке лежит символ или текст вместо числа),
        // должно быть брошено исключение MyArrayDataException с детализацией,
        // в какой именно ячейке лежат неверные данные.

        String[][] array = new String[4][4];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = String.valueOf(i);
            }
        }

        array[2][2] = "lala";
        int sum = 0;
        try {
            sum = summer(array);
        } catch (MyArrayDataException e) {
            System.out.println("Got an MyArrayDataException");
        }
        System.out.println(sum);

        //В методе main() вызвать полученный метод,
        // обработать возможные исключения MyArraySizeException
        // и MyArrayDataException и вывести результат расчета.
    }


    public static void arrayChecker(String[][] array) {
        if (array.length > 4 || array[0].length > 4) {
            throw new MyArraySizeException("Longer than 4 x 4");
        }
        System.out.println("correct");
    }


    public static int summer(String[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                sum += cellTransformer(array[i][j], i, j);
            }
        }
        return sum;
    }

    public static int cellTransformer(String number, int i, int j) {
        int num = 0;
        try {
            num = Integer.parseInt(number);
        } catch (Exception e) {
            throw new MyArrayDataException(String.format("Invalid data in cell coordinates i: %s j: %s", i, j));
        }
        return num;
    }
}
