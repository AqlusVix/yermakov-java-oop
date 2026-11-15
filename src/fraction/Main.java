package fraction;

public class Main {
    public static void main() {
        //1.5.5
        Fraction f1 = new Fraction(1, 3);
        Fraction f2 = new Fraction(2, 3);
        Fraction f3 = new Fraction(3, 4);

        System.out.println(f1 + " + " + f2 + " = " + f1.sum(f2));
        System.out.println(f1 + " + 2 = " + f1.sum(2));
        System.out.println(f1 + " - " + f2 + " = " + f1.minus(f2));
        System.out.println(f1 + " - 2 = " + f1.minus(2));
        System.out.println(f1 + " * " + f2 + " = " + f1.mult(f2));
        System.out.println(f1 + " * 2 = " + f1.mult(2));
        System.out.println(f1 + " / " + f2 + " = " + f1.div(f2));
        System.out.println(f1 + " / 2 = " + f1.div(2));
        System.out.println("f1.sum(f2).div(f3).minus(5) = "
                + f1.sum(f2).div(f3).minus(5));
        //1.5.5

        //1.6.4
        Fraction negative = new Fraction(2, -4);
        System.out.println("Отрицательный знаменатель приведен к положительному: " + negative);
        System.out.println("Исходная дробь после операции: " + f1);
        //1.6.4
    }
}
