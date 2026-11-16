package geometry;

import java.util.ArrayList;
import java.util.List;

public class GeometryUtils {
    public static int totalLength(List<? extends LengthMeasurable> objects) {
        int result = 0;
        for (LengthMeasurable object : objects) {
            result += object.getLength();
        }
        return result;
    }

    public static Polyline combine(List<? extends PolylineProvider> objects) {
        List<Point> points = new ArrayList<>();
        for (PolylineProvider object : objects) {
            points.addAll(object.getPolyline().getPoints());
        }
        return new Polyline(points);
    }
}
