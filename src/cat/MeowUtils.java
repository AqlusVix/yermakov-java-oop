package cat;

public class MeowUtils {
    public static void meowAll(Meowable... meowers) {
        for (Meowable meower : meowers) {
            meower.meow();
        }
    }
}
