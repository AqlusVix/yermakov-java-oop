package geometry;

import java.util.ArrayList;
import java.util.List;

public class Polyline {
    private List<Point> points;

    public Polyline() {
        this(new ArrayList<>());
    }

    public Polyline(List<Point> points) {
        this.points = new ArrayList<>(points);
    }

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = new ArrayList<>(points);
    }

    public void addPoints(Point... newPoints) {
        for (Point point : newPoints) {
            points.add(point);
        }
    }

    public int getLength() {
        int length = 0;
        for (int i = 1; i < points.size(); i++) {
            length += new Line(points.get(i - 1), points.get(i)).getLength();
        }
        return length;
    }

    @Override
    public String toString() {
        return "Линия " + points;
    }
}
