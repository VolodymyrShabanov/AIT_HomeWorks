package home_work_26.vehicle;

public class Motorcycle extends Vehicle{

    public final int id;
    public static int counter;

    public String model;

    public Motorcycle(String manufacturer, int yearOfManufacturer) {
        super(manufacturer, yearOfManufacturer);
        this.id = ++counter;
        this.model = "M-" + manufacturer + "/N-" + String.format("%03d", id);
    }

    @Override
    public void startEngine() {
        System.out.println("Motorcycle, model: " + model + " - engine running.");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
