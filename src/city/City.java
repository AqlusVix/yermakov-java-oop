package city;

import java.util.ArrayList;
import java.util.List;

public class City {
    private String name;
    private List<Route> routes = new ArrayList<>();

    public City(String name) {
        this.name = name;
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
