package fraction;

public final class Fraction extends Number {
    private final int numerator;
    private final int denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Знаменатель не может быть нулем");
        }
        long signedNumerator = numerator;
        long positiveDenominator = denominator;
        if (positiveDenominator < 0) {
            signedNumerator = -signedNumerator;
            positiveDenominator = -positiveDenominator;
        }
        long divisor = gcd(Math.abs(signedNumerator), positiveDenominator);
        this.numerator = Math.toIntExact(signedNumerator / divisor);
        this.denominator = Math.toIntExact(positiveDenominator / divisor);
    }

    private static long gcd(long a, long b) {
        while (b != 0) {
            long remainder = a % b;
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
    public int intValue() {
        return numerator / denominator;
    }

    @Override
    public long longValue() {
        return (long) numerator / denominator;
    }

    @Override
    public float floatValue() {
        return (float) numerator / denominator;
    }

    @Override
    public double doubleValue() {
        return (double) numerator / denominator;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
