package home_work_24.bus;

public class Vehicle {
    private String model;
    int yearOfManufacture;

    public Vehicle(String model, int yearOfManufacture) {
        //System.out.println("Конструктор Vehicle");
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
    }

    public Vehicle() {
        this.model = "Default";
    }


    public void start() {
        System.out.println(model + " начинает движение;");

    }

    public void stop() {
        System.out.println(model + " останавливается;");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String toString() {
        return model + " г.в.: " + yearOfManufacture + "!";
    }

}
