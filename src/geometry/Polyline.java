package geometry;

import java.util.ArrayList;
import java.util.List;

public class Polyline {
    private List<Point> points;

    public Polyline() {
        this(new ArrayList<>());
    }

    public Polyline(List<Point> points) {
        this.points = points;
    }

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Линия " + points;
    }
}
