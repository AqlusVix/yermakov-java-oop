package pointfeatures;

public class SizeFeature extends PointFeature {
    private final int size;

    public SizeFeature(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("Размер должен быть положительным");
        }
        this.size = size;
    }

    @Override
    public String describe() {
        return "размер: " + size;
    }
}
