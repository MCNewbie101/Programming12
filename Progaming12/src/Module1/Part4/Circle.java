package Module1.Part4;

public class Circle extends TwoDShape {
    public final double PI = 3.141592;
    private double radius;

    public Circle(double radius, Color color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", Colour=" + color +
                '}';
    }
}
