package Module1.Part2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<TwoDShape> shapeList = new ArrayList<>();
        shapeList.add(new Triangle(51.2, 24.56, 54.4));
        shapeList.add(new Triangle(51.2, 956, 9));
        shapeList.add(new Triangle(51.2, 24.56));
        shapeList.add(new Circle(2578));
        shapeList.add(new Circle(8.78850164));

        for (TwoDShape shape : shapeList) {
            System.out.println(shape.getArea());
            System.out.println(shape);
        }
    }
}
