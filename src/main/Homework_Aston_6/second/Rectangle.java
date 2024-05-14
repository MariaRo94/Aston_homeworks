package Homework_Aston_6.second;

public class Rectangle implements Shape {
    private double a;
    private double b;

    private String backgroundColor;
    private String boarderColor;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Rectangle(double a, double b, String backgroundColor, String boarderColor) {
        this.a = a;
        this.b = b;
        this.backgroundColor = backgroundColor;
        this.boarderColor = boarderColor;
    }

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
        return 2 * (a + b);
    }

    @Override
    public double area() {
        return a * b;
    }
}
