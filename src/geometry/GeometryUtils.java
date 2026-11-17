package geometry;

public class GeometryUtils {
    public static int totalLength(LengthMeasurable... objects) {
        int result = 0;
        for (LengthMeasurable object : objects) {
            result += object.getLength();
        }
        return result;
    }

    public static Polyline combine(PolylineProvider... objects) {
        Polyline result = new Polyline();
        for (PolylineProvider object : objects) {
            for (Point point : object.getPolyline().getPoints()) {
                result.addPoints(point);
            }
        }
        return result;
    }
}
