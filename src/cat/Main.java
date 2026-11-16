package cat;

import java.util.List;

public class Main {
    public static void main() {
        //1.5.2
        Cat barsik = new Cat("Барсик");
        System.out.println(barsik);
        barsik.meow();
        barsik.meow(3);
        //1.5.2

        //2.3.4
        MeowUtils.meowAll(List.of(new Cat("Мурка"), new Cat("Рыжик"), new ToyCat()));
        //2.3.4
    }
}
