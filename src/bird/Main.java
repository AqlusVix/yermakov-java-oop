package bird;

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
    }
}
