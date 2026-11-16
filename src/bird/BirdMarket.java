package bird;

import java.util.List;

public class BirdMarket {
    public static void singAll(List<? extends Bird> birds) {
        for (Bird bird : birds) {
            bird.sing();
        }
    }
}
