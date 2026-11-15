package city;

public class Route {
    private City destination;
    private int cost;

    public Route(City destination, int cost) {
        this.destination = destination;
        this.cost = cost;
    }

    public City getDestination() {
        return destination;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return destination.getName() + ": " + cost;
    }
}
