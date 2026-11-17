package numbers;

import fraction.Fraction;
import java.math.BigInteger;
import java.util.List;

import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {
        //2.3.1
        System.out.println(NumberUtils.sum(2, new Fraction(1, 2), 3.5));
        System.out.println(NumberUtils.sum(1.5, new Fraction(1, 4), 2,
                new Fraction(3, 4)));
        System.out.println(NumberUtils.sum(new Fraction(2, 3), 1));
        //2.3.1

        //3.1.3
        System.out.println(NumberUtils.sum(7, new Fraction(11, 3), 3.21,
                new BigInteger("12345678912345678912")));
        //3.1.3

        //3.1.4
        if (args.length >= 2) {
            System.out.println(power(args[0], args[1]));
        } else {
            System.out.println("Передайте основание и степень аргументами программы");
        }
        //3.1.4

        //4.2.2
        System.out.println(NumberUtils.divideStrings(List.of("100", "текст", "2", "5")));
        //4.2.2
    }

    public static double power(String x, String y) {
        return pow(parseInt(x), parseInt(y));
    }
}
