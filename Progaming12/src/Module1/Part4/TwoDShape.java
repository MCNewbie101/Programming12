package Module1.Part4;

public abstract class TwoDShape {
    double width;
    double height;
    enum Color {
        RED, GREEN, BLUE, BLACK, WHITE, YELLOW, ORANGE, PURPLE, ANEMO, NONE
    };
    Color color;

    public TwoDShape(double width, double height, Color color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public TwoDShape(Color color) {
        this.width = 0;
        this.height = 0;
        this.color = color;
    }

    public abstract double getArea();

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }
}
