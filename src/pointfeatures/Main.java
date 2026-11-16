package pointfeatures;

import geometry.Point;
import geometry.Point3D;

public class Main {
    public static void main() {
        //2.2.5
        ConfigurablePoint red = new ConfigurablePoint(3);
        red.addFeature(new ColorFeature("красный"));

        ConfigurablePoint sized = new ConfigurablePoint(4, 2, 5);
        sized.addFeature(new SizeFeature(20));

        ConfigurablePoint decorated = new ConfigurablePoint(7, 7);
        decorated.addFeature(new ColorFeature("желтый"));
        decorated.addFeature(new BorderFeature("красный", "котенок"));

        System.out.println(red);
        System.out.println(sized);
        System.out.println(decorated);
        System.out.println("Старые точки без изменений: "
                + new Point(4, 2) + ", " + new Point3D(4, 2, 5));
        //2.2.5
    }
}
