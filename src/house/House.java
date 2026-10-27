package house;

public class House {
    private int numberOfFloors;

    public House(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        String rightFloor;
        if(numberOfFloors % 100 == 11){
            rightFloor = " этажами";
        }
        else if (numberOfFloors % 10 == 1) {
            rightFloor = " этажом";
        }
        else {
            rightFloor = " этажами";
        }
        return "Дом с " + numberOfFloors + rightFloor;
    }
}
