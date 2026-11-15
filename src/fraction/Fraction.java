package fraction;

public class Fraction {
    private final int numerator;
    private final int denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Знаменатель не может быть нулем");
        }
        int divisor = gcd(Math.abs(numerator), Math.abs(denominator));
        int sign = denominator < 0 ? -1 : 1;
        this.numerator = sign * numerator / divisor;
        this.denominator = sign * denominator / divisor;
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }

    public Fraction sum(Fraction other) {
        return new Fraction(numerator * other.denominator + other.numerator * denominator,
                denominator * other.denominator);
    }

    public Fraction sum(int number) {
        return sum(new Fraction(number, 1));
    }

    public Fraction minus(Fraction other) {
        return new Fraction(numerator * other.denominator - other.numerator * denominator,
                denominator * other.denominator);
    }

    public Fraction minus(int number) {
        return minus(new Fraction(number, 1));
    }

    public Fraction mult(Fraction other) {
        return new Fraction(numerator * other.numerator, denominator * other.denominator);
    }

    public Fraction mult(int number) {
        return mult(new Fraction(number, 1));
    }

    public Fraction div(Fraction other) {
        return new Fraction(numerator * other.denominator, denominator * other.numerator);
    }

    public Fraction div(int number) {
        return div(new Fraction(number, 1));
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
