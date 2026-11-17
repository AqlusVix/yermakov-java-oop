package bird;

public class BirdMarket {
    public static void singAll(Bird... birds) {
        for (Bird bird : birds) {
            bird.sing();
        }
    }
}
