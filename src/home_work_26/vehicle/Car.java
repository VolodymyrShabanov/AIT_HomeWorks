package home_work_26.vehicle;

public class Car extends Vehicle{

    public final int id;
    public static int counter;

    public String model;

    public Car(String manufacturer, int yearOfManufacturer) {
        super(manufacturer, yearOfManufacturer);
        this.id = ++counter;
        this.model = "C-" + manufacturer + "/N-" + String.format("%03d", id);
    }

    @Override
    public void startEngine() {
        System.out.println("Car, model: " + model + " - engine running.");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
