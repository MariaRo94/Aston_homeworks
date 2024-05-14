package Aston_3_homework;

/*Cоздайте метод compareNumbers(), в теле которого объявите
        две int переменные a и b, и инициализируйте их любыми значениями, которыми захотите.
        Если a больше или равно b, то необходимо вывести в консоль
        сообщение “a >= b”, в противном случае “a < b”;*/
public class Task4 {
    public static void main(String[] args) {
        compareNumbers();
    }

    public static void compareNumbers() {
        int a = 9;
        int b = 99;
        if (a >= b) {
            System.out.println("a>=b");
        } else if (a < b) {
            System.out.println("a<b");
        }

    }
}
