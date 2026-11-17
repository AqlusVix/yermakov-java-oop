package numbers;

import java.util.List;

public class NumberUtils {
    public static double sum(Number... numbers) {
        double result = 0;
        for (Number number : numbers) {
            result += number.doubleValue();
        }
        return result;
    }

    public static double divideStrings(List<String> strings) {
        double result = 0;
        boolean hasNumber = false;
        for (String string : strings) {
            double number;
            try {
                number = Double.parseDouble(string);
            } catch (NumberFormatException error) {
                continue;
            }
            if (!hasNumber) {
                result = number;
                hasNumber = true;
            } else {
                result /= number;
            }
        }
        if (!hasNumber) {
            throw new IllegalArgumentException("Нет чисел для деления");
        }
        return result;
    }
}
