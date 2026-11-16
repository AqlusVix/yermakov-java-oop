package figures;

public class Main {
    public static void main() {
        //2.2.4
        Figure circle = new Circle(2);
        Figure rectangle = new Rectangle(4, 6);
        Figure square = new Square(5);
        Figure triangle = new Triangle(6, 3);
        System.out.println("Площадь круга: " + circle.getArea());
        System.out.println("Площадь прямоугольника: " + rectangle.getArea());
        System.out.println("Площадь квадрата: " + square.getArea());
        System.out.println("Площадь треугольника: " + triangle.getArea());
        //2.2.4
    }
}
