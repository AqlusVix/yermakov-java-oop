package cat;

public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public void meow() {
        meow(1);
    }

    public void meow(int times) {
        if (times <= 0) {
            return;
        }
        StringBuilder sound = new StringBuilder();
        for (int i = 0; i < times; i++) {
            if (i > 0) {
                sound.append('-');
            }
            sound.append("мяу");
        }
        System.out.println(name + ": " + sound + "!");
    }

    @Override
    public String toString() {
        return "кот: " + name;
    }
}
