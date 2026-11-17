package figures;

public class FigureUtils {
    public static double totalArea(Figure... figures) {
        double result = 0;
        for (Figure figure : figures) {
            result += figure.getArea();
        }
        return result;
    }
}
