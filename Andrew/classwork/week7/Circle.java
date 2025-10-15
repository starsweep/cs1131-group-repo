class Circle extends Shape {
    private double radius;
    private String name = "Circle";

    Circle(double instanceRadius) {
        radius = instanceRadius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public String getName() {
        return name;
    }
}
