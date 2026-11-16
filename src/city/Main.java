package city;

import java.util.List;

public class Main {
    public static void main() {
        //1.3.3
        City a = new City("A");
        City b = new City("B");
        City c = new City("C");
        City d = new City("D");
        City e = new City("E");
        City f = new City("F");

        a.addRoute(b, 5);
        b.addRoute(a, 5);
        a.addRoute(f, 1);
        f.addRoute(b, 1);
        b.addRoute(c, 3);
        c.addRoute(b, 3);
        f.addRoute(e, 2);
        e.addRoute(f, 2);
        c.addRoute(d, 4);
        d.addRoute(c, 4);
        e.addRoute(d, 2);
        d.addRoute(e, 2);
        a.addRoute(d, 6);
        d.addRoute(a, 6);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        //1.3.3

        //1.4.8
        City newCity = new City("Новый");
        City connectedCity = new City("G", List.of(new Route(a, 7), new Route(b, 4)));
        System.out.println(newCity);
        System.out.println(connectedCity);
        //1.4.8

        //1.6.9
        City uniqueRoads = new City("H", List.of(
                new Route(a, 5), new Route(a, 8), new Route(b, 3)
        ));
        System.out.println("После создания: " + uniqueRoads);
        uniqueRoads.addRoute(a, 10);
        System.out.println("После обновления дороги: " + uniqueRoads);
        uniqueRoads.removeRoute(b);
        System.out.println("После удаления дороги: " + uniqueRoads);
        //1.6.9

        //2.1.3
        TwoWayCity twoWay = new TwoWayCity("Двусторонний");
        City neighbor = new City("Соседний");
        twoWay.addRoute(neighbor, 5);
        System.out.println(twoWay);
        System.out.println(neighbor);
        twoWay.addRoute(neighbor, 8);
        System.out.println("После обновления: " + twoWay + "; " + neighbor);
        twoWay.removeRoute(neighbor);
        System.out.println("После удаления: " + twoWay + "; " + neighbor);
        TwoWayCity anotherTwoWay = new TwoWayCity("Второй двусторонний");
        twoWay.addRoute(anotherTwoWay, 4);
        System.out.println("Два двусторонних города: " + twoWay + "; " + anotherTwoWay);
        //2.1.3
    }
}
