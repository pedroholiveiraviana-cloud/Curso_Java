public record Square(double side) implements GeometricForn{
    @Override
    public double getArea() {
        return side * side;
    }
}
