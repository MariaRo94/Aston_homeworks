/*Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
 и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, 
 если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, 
 то есть [0][0], [1][1], [2][2], ..., [n][n];*/

public class Task13 {
    public static void main(String[] args) {
        int [][] result = doubleArray(10);
        printMatrix(result);

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
}

