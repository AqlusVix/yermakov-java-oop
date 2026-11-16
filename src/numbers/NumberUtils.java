package numbers;

import java.util.List;

public class NumberUtils {
    public static double sum(List<? extends Number> numbers) {
        double result = 0;
        for (Number number : numbers) {
            result += number.doubleValue();
        }
        return result;
    }
}
