package home_work_26.vehicle;

public class Vehicle {
    private String manufacturer;
    private int yearOfManufacturer;

    public Vehicle(String manufacturer, int yearOfManufacturer) {
        this.manufacturer = manufacturer;
        this.yearOfManufacturer = yearOfManufacturer;
    }

    public void startEngine() {
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYearOfManufacturer() {
        return yearOfManufacturer;
    }

    public void setYearOfManufacturer(int yearOfManufacturer) {
        this.yearOfManufacturer = yearOfManufacturer;
    }
}
