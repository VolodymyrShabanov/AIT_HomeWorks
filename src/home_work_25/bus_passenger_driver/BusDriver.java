package home_work_25.bus_passenger_driver;

public class BusDriver {
    private final int id;
    private String name;
    private String driverLicence;

    private int counter;

    public BusDriver(String name, String driverLicence) {
        this.name = name;
        this.driverLicence = driverLicence;
        this.id = counter++;
    }
    public String toString() {
        return "{Bus Driver id: " + id + "; name: " + "; License: " + driverLicence + "}";
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDriverLicence() {
        return driverLicence;
    }

    public void setDriverLicence(String driverLicence) {
        this.driverLicence = driverLicence;
    }
}
