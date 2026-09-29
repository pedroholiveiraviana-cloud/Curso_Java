public record Circle(double radius) implements GeometricForn{


    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius,2);
    }
}
