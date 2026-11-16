package bird;

public class Parrot extends Bird {
    private final String text;

    public Parrot(String text) {
        if (text == null || text.isEmpty()) {
            throw new IllegalArgumentException("Попугаю нужен непустой текст");
        }
        this.text = text;
    }

    @Override
    public void sing() {
        int length = 1 + (int) (Math.random() * text.length());
        System.out.println(text.substring(0, length));
    }
}
