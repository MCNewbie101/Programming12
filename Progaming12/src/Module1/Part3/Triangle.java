package Module1.Part3;

public class Triangle extends TwoDShape implements Rotate {
    double side1;
    double side2;
    double side3;

    public Triangle(double width, double height) {
        super(width, height);
    }

    public Triangle(double side1, double side2, double side3) {
        super(side3, 0);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        setHeight(heronsHeight());
    }

    private double  heronsHeight() {
        double s = (side1 + side2 + side3) / 2;
        double a = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return a * 2 / side3;
    }

    @Override
    public double getArea() {
        return height * width / 2;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    @Override
    public void rotate90() {

    }

    @Override
    public void rotate180() {

    }

    @Override
    public void rotate(double degrees) {

    }
}
