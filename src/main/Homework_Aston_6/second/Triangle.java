package Homework_Aston_6.second;

public class Triangle implements Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle(double a, double b, double c, String backgroundColor, String boarderColor) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.backgroundColor = backgroundColor;
        this.boarderColor = boarderColor;
    }

    private String backgroundColor;
    private String boarderColor;

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public String getBoarderColor() {
        return boarderColor;
    }

    public void setBoarderColor(String boarderColor) {
        this.boarderColor = boarderColor;
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }

    @Override
    public double area() {
        return (double) 1 / 2 * (a * b);
    }
}
