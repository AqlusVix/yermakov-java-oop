package geometry;

import java.util.List;

public class Square {
    private Point topLeft;
    private int side;

    public Square(Point topLeft, int side) {
        this.topLeft = topLeft;
        setSide(side);
    }

    public Square(int x, int y, int side) {
        this(new Point(x, y), side);
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        if (side <= 0) {
            throw new IllegalArgumentException("Сторона квадрата должна быть положительной");
        }
        this.side = side;
    }

    public Polyline toPolyline() {
        int x = topLeft.getX();
        int y = topLeft.getY();
        return new Polyline(List.of(
                new Point(x, y),
                new Point(x + side, y),
                new Point(x + side, y + side),
                new Point(x, y + side),
                new Point(x, y)
        ));
    }

    @Override
    public String toString() {
        return "Квадрат в точке " + topLeft + " со стороной " + side;
    }
}
