package bird;

public class Cuckoo extends Bird {
    @Override
    public void sing() {
        int times = 1 + (int) (Math.random() * 10);
        for (int i = 0; i < times; i++) {
            System.out.println("ку-ку");
        }
    }
}
