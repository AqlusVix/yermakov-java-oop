package cat;

import java.util.List;

public class MeowUtils {
    public static void meowAll(List<? extends Meowable> meowers) {
        for (Meowable meower : meowers) {
            meower.meow();
        }
    }
}
