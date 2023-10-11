package home_work_24.bus;

public class Train extends Vehicle{
    int capacity;
    int countPassengers;
    int countWagons;

    static final int WAGON_CAPACITY = 32; //Ctl + Shift + U
    public Train(String model, int yearOfManufacture, int countWagons) {
        super(model, yearOfManufacture);
        this.countWagons = countWagons;
        this.capacity = countWagons * WAGON_CAPACITY;
    }

    public int getCountWagons() {
        return countWagons;
    }

    public void setCountWagons(int countWagons) {
        capacity = countWagons * WAGON_CAPACITY;
        this.countWagons = countWagons;
    }
}
