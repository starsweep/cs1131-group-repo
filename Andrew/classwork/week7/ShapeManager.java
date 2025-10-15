import java.util.ArrayList;

class ShapeManager {
    public static void main(String[] args) {
        ArrayList<Shape> shapeList = new ArrayList<>();

        Rectangle rectangle1 = new Rectangle(1, 2);
        Rectangle rectangle2 = new Rectangle(3, 4);

        Square square1 = new Square(1);
        Square square2 = new Square(2);

        Circle circle1 = new Circle(1);
        Circle circle2 = new Circle(2);

        Triangle triangle1 = new Triangle(1, 2);
        Triangle triangle2 = new Triangle(3, 4);

        shapeList.add(rectangle1);
        shapeList.add(rectangle2);

        shapeList.add(square1);
        shapeList.add(square2);

        shapeList.add(circle1);
        shapeList.add(circle2);

        shapeList.add(triangle1);
        shapeList.add(triangle2);

        double totalArea = 0;

        for (Shape shape : shapeList) {
            totalArea += shape.getArea();
            System.out.printf("Name: %s%n", shape.getName());
            System.out.printf("Area: %f%n", shape.getArea());
            System.out.println();
        }

        System.out.printf("Total area: %f%n", totalArea);
    }
}
