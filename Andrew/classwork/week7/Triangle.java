class Triangle extends Shape {
    private double base;
    private double height;
    private String name = "Triangle";

    Triangle(double instanceBase, double instanceHeight) {
        base = instanceBase;
        height = instanceHeight;
    }

    public double getArea() {
        return (0.5) * base * height;
    }

    public String getName() {
        return name;
    }
}
