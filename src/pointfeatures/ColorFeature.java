package pointfeatures;

public class ColorFeature extends PointFeature {
    private final String color;

    public ColorFeature(String color) {
        this.color = color;
    }

    @Override
    public String describe() {
        return "цвет: " + color;
    }
}
