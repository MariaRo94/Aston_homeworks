/*Напишите метод, которому в качестве параметра передается целое число,
метод должен напечатать в консоль, положительное ли число передали или отрицательное.
 Замечание: ноль считаем положительным числом.*/

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int toScan = scan.nextInt();
        if (toScan >= 0) {
            System.out.println("The number is positive");
        }
        else {
            System.out.println("The number is negative");
        }

    }


}
