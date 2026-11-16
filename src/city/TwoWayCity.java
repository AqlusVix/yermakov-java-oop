package city;

import java.util.List;

public class TwoWayCity extends City {
    public TwoWayCity(String name) {
        super(name);
    }

    public TwoWayCity(String name, List<Route> routes) {
        this(name);
        for (Route route : routes) {
            addRoute(route.getDestination(), route.getCost());
        }
    }

    @Override
    public void addRoute(City destination, int cost) {
        super.addRoute(destination, cost);
        if (destination != this) {
            destination.addDirectRoute(this, cost);
        }
    }

    @Override
    public boolean removeRoute(City destination) {
        boolean removed = super.removeRoute(destination);
        if (removed && destination != this) {
            destination.removeDirectRoute(this);
        }
        return removed;
    }
}
