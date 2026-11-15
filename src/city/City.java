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
        this.routes = new ArrayList<>();
        for (Route route : routes) {
            addRoute(route.getDestination(), route.getCost());
        }
    }

    public String getName() {
        return name;
    }

    public List<Route> getRoutes() {
        return List.copyOf(routes);
    }

    public void addRoute(City destination, int cost) {
        for (int i = 0; i < routes.size(); i++) {
            if (routes.get(i).getDestination() == destination) {
                routes.set(i, new Route(destination, cost));
                return;
            }
        }
        routes.add(new Route(destination, cost));
    }

    public boolean removeRoute(City destination) {
        for (int i = 0; i < routes.size(); i++) {
            if (routes.get(i).getDestination() == destination) {
                routes.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return name + ": " + routes;
    }
}
