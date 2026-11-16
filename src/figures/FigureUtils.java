package figures;

import java.util.List;

public class FigureUtils {
    public static double totalArea(List<? extends Figure> figures) {
        double result = 0;
        for (Figure figure : figures) {
            result += figure.getArea();
        }
        return result;
    }
}
