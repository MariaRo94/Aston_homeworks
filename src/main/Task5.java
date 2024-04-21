/* Напишите метод, принимающий на вход два целых числа и проверяющий,
что их сумма лежит в пределах от 10 до 20 (включительно),
если да – вернуть true, в противном случае – false.*/

public class Task5 {
    public static void main(String[] args) {
        System.out.println(checkNumber(5,77));
    }

    public static boolean checkNumber(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }
}


