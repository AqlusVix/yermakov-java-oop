package city;

import java.util.ArrayList;
import java.util.List;

public class City {
    private String name;
    private List<Route> routes;

    public City(String name) {
        this(name, List.of());
    }

    public City(String name, List<Route> routes) {
        this.name = name;
        this.routes = new ArrayList<>(routes);
    }

    public String getName() {
        return name;
    }

    public List<Route> getRoutes() {
        return List.copyOf(routes);
    }

    public void addRoute(City destination, int cost) {
        routes.add(new Route(destination, cost));
    }

    @Override
    public String toString() {
        return name + ": " + routes;
    }
}
