package home_work_24.printer;

public class ComputerPeripheral {
    private final String manufacturer;
    private final int yearOfManufacture;

    public ComputerPeripheral (String manufacturer, int yearOfManufacture) {
        this.manufacturer = manufacturer;
        this.yearOfManufacture = yearOfManufacture;
    }

    public String toString() {
        return "Manufacturer: " + manufacturer + "; YoM is - " + yearOfManufacture;
    }

    public void connected () {
        System.out.println("Manufacturer's device : " + manufacturer + " is: connected.");
    }

    public void disconnected () {
        System.out.println("Manufacturer's device : " + manufacturer + " is: disconnected");
    }
    public void on () {
        System.out.println("Manufacturer's device : " + manufacturer + " is: ON.");
    }

    public void off () {
        System.out.println("Manufacturer's device : " + manufacturer + " is: OFF.");
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }
}
