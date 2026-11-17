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

        // После 1.6.6 линии хранят копии точек, поэтому изменения независимы.
        l1.setStart(2, 3);
        l2.setEnd(25, 12);
        System.out.println("После изменения первых линий: " + l3);

        // Замена точки первой линии тоже не меняет третью.
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

        //1.6.3
        square.setSide(10);
        System.out.println("Новая сторона квадрата: " + square.getSide());
        try {
            new Square(0, 0, 0);
        } catch (IllegalArgumentException error) {
            System.out.println(error.getMessage());
        }
        try {
            square.setSide(-3);
        } catch (IllegalArgumentException error) {
            System.out.println(error.getMessage());
        }
        //1.6.3

        //1.6.6
        Point commonPoint = new Point(1, 1);
        Line separateFirst = new Line(commonPoint, new Point(4, 4));
        Line separateSecond = new Line(commonPoint, new Point(5, 5));
        commonPoint.setX(99);
        Point returnedPoint = separateFirst.getStart();
        returnedPoint.setY(99);
        System.out.println("Линии после изменения внешних точек: "
                + separateFirst + "; " + separateSecond);
        separateFirst.setStart(2, 2);
        System.out.println("После изменения первой линии: "
                + separateFirst + "; " + separateSecond);
        //1.6.6

        //2.1.2
        List<Point> corners = List.of(new Point(1, 1), new Point(4, 1), new Point(4, 5));
        Polyline openPolyline = new Polyline(corners);
        ClosedPolyline closedPolyline = new ClosedPolyline(corners);
        System.out.println("Открытая ломаная: " + openPolyline.getLength());
        System.out.println("Замкнутая ломаная: " + closedPolyline.getLength());
        //2.1.2

        //2.1.5
        Point3D point3D = new Point3D(3, 5, 7);
        System.out.println("Трехмерная точка: " + point3D);
        // Класс Point разрешает наследование только классу Point3D.
        //2.1.5

        //2.3.5
        Line lengthLine = new Line(0, 0, 3, 4);
        Polyline lengthPolyline = new Polyline(List.of(
                new Point(0, 0), new Point(0, 3), new Point(4, 3)));
        System.out.println("Сумма длин: " + GeometryUtils.totalLength(
                lengthLine, lengthPolyline));
        //2.3.5

        //2.3.6
        Polyline closedSquare = square.toPolyline();
        System.out.println("Квадрат возвращает замкнутую ломаную: "
                + (closedSquare instanceof ClosedPolyline));
        System.out.println("Ее длина: " + closedSquare.getLength());
        //2.3.6

        //2.3.7
        Square firstSquare = new Square(0, 0, 2);
        Square secondSquare = new Square(5, 5, 3);
        Polyline combined = GeometryUtils.combine(firstSquare, secondSquare);
        System.out.println("Объединенная ломаная: " + combined);
        System.out.println("Ее длина: " + combined.getLength());
        //2.3.7

        //3.1.5
        Point ownPoint = new Point(3, 5);
        java.awt.Point awtPoint = new java.awt.Point(3, 5);
        System.out.println("Своя точка: " + ownPoint);
        System.out.println("Точка java.awt: " + awtPoint);
        //3.1.5
    }
}
