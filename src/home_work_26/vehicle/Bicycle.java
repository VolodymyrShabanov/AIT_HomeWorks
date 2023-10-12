package home_work_26.vehicle;

public class Bicycle extends Vehicle{

    public final int id;
    public static int counter;

    public String model;

    public Bicycle(String manufacturer, int yearOfManufacturer) {
        super(manufacturer, yearOfManufacturer);
        this.id = ++counter;
        this.model = "B-" + manufacturer + "/N-" + String.format("%03d", id);
    }

    @Override
    public void startEngine() {
        System.out.println("Bicycle, model: " + model + " - No engine.");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

}
