package Homework_Aston_6.second;

public class Circle implements Shape {
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

    //P = 2 π r

    //S = π r2

    @Override
    public Double calculatePerimeter() {
        return 0.0;
    }

    @Override
    public Double calculateSquare() {
        return 0.0;
    }
}
