package figures;

public class Rectangle extends Figure {
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Стороны должны быть положительными");
        }
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
