package pointfeatures;

public class BorderFeature extends PointFeature {
    private final String color;
    private final String shape;

    public BorderFeature(String color, String shape) {
        this.color = color;
        this.shape = shape;
    }

    @Override
    public String describe() {
        return "ободок: " + color + ", форма: " + shape;
    }
}
