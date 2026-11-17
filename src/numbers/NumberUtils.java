package numbers;

public class NumberUtils {
    public static double sum(Number... numbers) {
        double result = 0;
        for (Number number : numbers) {
            result += number.doubleValue();
        }
        return result;
    }
}
