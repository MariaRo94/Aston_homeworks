package Homework_Aston_6.second;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(1, 2, 3, "blue", "red");
        Rectangle rectangle = new Rectangle(3, 5, "yellow", "pink");
        Circle circle = new Circle(5, "black", "white");

        System.out.println(triangle.area());
        System.out.println(triangle.perimeter());
        System.out.println(triangle.getBackgroundColor());
        System.out.println(triangle.getBoarderColor());

        System.out.println(rectangle.area());
        System.out.println(rectangle.perimeter());
        System.out.println(rectangle.getBackgroundColor());
        System.out.println(rectangle.getBoarderColor());

        System.out.println(circle.area());
        System.out.println(circle.perimeter());
        System.out.println(circle.getBackgroundColor());
        System.out.println(circle.getBoarderColor());
    }
}
