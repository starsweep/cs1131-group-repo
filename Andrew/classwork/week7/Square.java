class Square extends Rectangle {
    private String name = "Square";

    Square(double instanceLength) {
        super(instanceLength, instanceLength);
    }

    public String getName() {
        return name;
    }
}
