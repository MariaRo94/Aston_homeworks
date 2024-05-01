/*Напишите метод, которому в качестве аргументов передается строка и число,
метод должен отпечатать в консоль указанную строку, указанное количество раз;
 */
public class Task8 {
    public static void main(String[] args) {
        printStr("I love Java", 8);
    }

    public static void printStr(String str, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(str);
        }
    }

}
