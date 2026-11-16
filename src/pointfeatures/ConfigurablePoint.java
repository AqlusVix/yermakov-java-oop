package pointfeatures;

import java.util.ArrayList;
import java.util.List;

public class ConfigurablePoint {
    private final List<Integer> coordinates = new ArrayList<>();
    private final List<PointFeature> features = new ArrayList<>();

    public ConfigurablePoint(int... coordinates) {
        if (coordinates.length < 1 || coordinates.length > 3) {
            throw new IllegalArgumentException("У точки должно быть от 1 до 3 координат");
        }
        for (int coordinate : coordinates) {
            this.coordinates.add(coordinate);
        }
    }

    public void addFeature(PointFeature feature) {
        if (feature == null) {
            throw new IllegalArgumentException("Характеристика не может быть null");
        }
        features.add(feature);
    }

    public List<Integer> getCoordinates() {
        return List.copyOf(coordinates);
    }

    public List<PointFeature> getFeatures() {
        return List.copyOf(features);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Точка {");
        for (int i = 0; i < coordinates.size(); i++) {
            if (i > 0) {
                result.append(';');
            }
            result.append(coordinates.get(i));
        }
        result.append('}');
        for (PointFeature feature : features) {
            result.append(", ").append(feature.describe());
        }
        return result.toString();
    }
}
