package bird;

import java.util.List;

public class Main {
    public static void main() {
        //2.2.3
        Bird sparrow = new Sparrow();
        Bird cuckoo = new Cuckoo();
        Bird parrot = new Parrot("Я умею говорить");
        sparrow.sing();
        cuckoo.sing();
        parrot.sing();
        //2.2.3

        //2.3.2
        BirdMarket.singAll(List.of(new Sparrow(), new Sparrow(), new Cuckoo(),
                new Parrot("Привет"), new Parrot("Я попугай")));
        //2.3.2
    }
}
