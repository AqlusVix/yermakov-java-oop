package geometry;

import java.util.List;

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

        //1.3.2
        Point sharedStart = new Point(1, 5);
        Point sharedEnd = new Point(5, 3);
        Polyline first = new Polyline(List.of(sharedStart, new Point(2, 8), sharedEnd));
        Polyline second = new Polyline(List.of(sharedStart, new Point(2, -5), new Point(4, -8), sharedEnd));

        System.out.println(first);
        System.out.println(second);
        sharedStart.setX(3);
        sharedStart.setY(6);
        System.out.println("После сдвига общей точки:");
        System.out.println(first);
        System.out.println(second);
        //1.3.2

        //1.4.1
        Point point35 = new Point(3, 5);
        Point point256 = new Point(25, 6);
        Point point78 = new Point(7, 8);
        System.out.println(point35);
        System.out.println(point256);
        System.out.println(point78);
        //1.4.1

        //1.4.2
        Line line1 = new Line(new Point(1, 3), new Point(23, 8));
        Line line2 = new Line(5, 10, 25, 10);
        Line line3 = new Line(line1.getStart(), line2.getEnd());
        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        //1.4.2

        //1.4.3
        Polyline empty = new Polyline();
        Polyline throughThreePoints = new Polyline(List.of(point35, point256, point78));
        System.out.println(empty);
        System.out.println(throughThreePoints);
        //1.4.3

        //1.5.3
        Line measuredLine = new Line(1, 1, 10, 15);
        System.out.println("Длина " + measuredLine + ": " + measuredLine.getLength());
        //1.5.3

        //1.5.7
        Polyline measuredPolyline = new Polyline(List.of(
                new Point(1, 5), new Point(2, 8), new Point(5, 3)
        ));
        System.out.println("Длина ломаной: " + measuredPolyline.getLength());
        measuredPolyline.addPoints(new Point(5, 15), new Point(8, 10));
        System.out.println("Длина после добавления точек: " + measuredPolyline.getLength());
        //1.5.7

        //1.5.8
        Square square = new Square(5, 3, 23);
        Polyline squareOutline = square.toPolyline();
        System.out.println(square);
        System.out.println("Длина ломаной квадрата: " + squareOutline.getLength());
        Point lastPoint = squareOutline.getPoints().get(squareOutline.getPoints().size() - 1);
        lastPoint.setX(15);
        lastPoint.setY(25);
        System.out.println("Длина после сдвига последней точки: " + squareOutline.getLength());
        //1.5.8
    }
}
