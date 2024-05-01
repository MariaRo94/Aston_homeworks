/*Напишите метод, которому в качестве параметра передается целое число.
        Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.*/
public class Task7 {
    public static void main(String[] args) {
        System.out.println(isPositive(7));
    }

    public static boolean isPositive(int a) {
        return a >= 0;
    }
}
