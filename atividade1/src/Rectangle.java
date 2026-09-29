public record Rectangle(double height , double width) implements GeometricForn{
    @Override
    public double getArea() {
        return width * height;
    }
}
