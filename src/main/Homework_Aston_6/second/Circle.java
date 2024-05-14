package Homework_Aston_6.second;

public class Circle implements Shape {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public Circle(double r, String backgroundColor, String boarderColor) {
        this.r = r;
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
        return 2 * 3.14 * r;
    }

    @Override
    public double area() {
        return 3.14 * r * r;
    }
}
