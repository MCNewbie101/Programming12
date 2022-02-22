package Module1.Part4;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Module1.Part4.TwoDShape> shapeList = new ArrayList<>();
        shapeList.add(new Triangle(51.2, 24.56, 54.4, TwoDShape.Color.ANEMO));
        shapeList.add(new Triangle(51.2, 956, 919, TwoDShape.Color.BLACK));
        shapeList.add(new Triangle(51.2, 24.56, TwoDShape.Color.RED));
        shapeList.add(new Circle(2578, TwoDShape.Color.YELLOW));
        shapeList.add(new Circle(8.78850164, TwoDShape.Color.WHITE));

        for (TwoDShape shape : shapeList) {
            System.out.println(shape.getArea());
            System.out.println(shape);
        }
    }
}
