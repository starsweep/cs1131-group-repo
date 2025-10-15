class Rectangle extends Shape {
    private double length;
    private double width;
    private String name = "Rectangle";

    Rectangle(double instanceLength, double instanceWidth) {
        length = instanceLength;
        width = instanceWidth;
    }

    public double getArea() {
        return length * width;
    }

    public String getName() {
        return name;
    }
}