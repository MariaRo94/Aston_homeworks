
/*14. Написать метод, принимающий на вход два аргумента: len и initialValue,
 и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue.
*/

import java.util.Arrays;

public class Task14 {

    public static void main(String[] args) {
        printArray(createArray(5,78));
    }

    public static int[] createArray(int len, int initialValue) {
        int array[] = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }

    public static void printArray(int [] array) {
        for (int i = 0; i < array.length; i++) {
           System.out.print(array[i]);
        }
    }
}
