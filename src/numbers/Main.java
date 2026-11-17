package numbers;

import fraction.Fraction;

public class Main {
    public static void main() {
        //2.3.1
        System.out.println(NumberUtils.sum(2, new Fraction(1, 2), 3.5));
        System.out.println(NumberUtils.sum(1.5, new Fraction(1, 4), 2,
                new Fraction(3, 4)));
        System.out.println(NumberUtils.sum(new Fraction(2, 3), 1));
        //2.3.1
    }
}
