package geometry;

import java.util.List;

public class ClosedPolyline extends Polyline {
    public ClosedPolyline() {
        super();
    }

    public ClosedPolyline(List<Point> points) {
        super(points);
    }

    @Override
    public int getLength() {
        int length = super.getLength();
        List<Point> points = getPoints();
        if (points.size() > 1) {
            length += new Line(points.get(points.size() - 1), points.get(0)).getLength();
        }
        return length;
    }
}
