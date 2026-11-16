package numbers;

import fraction.Fraction;
import java.util.List;

public class Main {
    public static void main() {
        //2.3.1
        System.out.println(NumberUtils.sum(List.of(2, new Fraction(1, 2), 3.5)));
        System.out.println(NumberUtils.sum(List.of(1.5, new Fraction(1, 4), 2,
                new Fraction(3, 4))));
        System.out.println(NumberUtils.sum(List.of(new Fraction(2, 3), 1)));
        //2.3.1
    }
}
