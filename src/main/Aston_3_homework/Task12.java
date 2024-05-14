package Aston_3_homework;/* Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
пройти по нему циклом, и числа меньшие 6 умножить на 2
 */

public class Task12 {
    public static void main(String[] args) {
        createMatrix();

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
}
