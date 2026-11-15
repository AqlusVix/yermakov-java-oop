package geometry;

public class Main {
    public static void main(){
        //1.1.1
        Point point1 = new Point(1, 3);
        Point point2 = new Point(4, 6);
        Point point3 = new Point(-1, -3);

        System.out.println(point1 + ", " + point2 + ", " + point3);
        //1.1.1

        //1.2.1
        Line l1 = new Line(1, 3, 23, 8);
        Line l2 = new Line(5, 10, 25, 10);
        Line l3 = new Line(l1.getStart(), l2.getEnd());

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);

        // Меняем общие точки: третья линия меняется вместе с первыми двумя.
        l1.getStart().setX(2);
        l2.getEnd().setY(12);
        System.out.println("После изменения общих точек: " + l3);

        // Заменяем точку первой линии: прежняя точка остается у третьей.
        l1.setStart(new Point(100, 100));
        System.out.println("Первая линия: " + l1);
        System.out.println("Третья линия: " + l3);
        //1.2.1
    }
}
