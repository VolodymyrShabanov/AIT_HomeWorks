package home_work_24.printer;

public class Scanner extends ComputerPeripheral{
    private final int id;
    private static int counter;
    private String model;
    private boolean colorScanner;

    public Scanner(String manufacturer,
                   int yearOfManufacture,
                   String model,
                   boolean colorScanner) {
        super(manufacturer, yearOfManufacture);
        this.id = counter;
        this.model = model;
        this.colorScanner = colorScanner;
    }

    public String toString () {
        StringBuilder sb = new StringBuilder();
        sb.append("Manufacturer: ").append(getManufacturer())
                .append("model: ").append(model)
                .append("; YoM is - ").append(getYearOfManufacture());

        return sb.toString();
    }

    public void scanning (int pages) {
        super.on();
        super.connected();
        System.out.println("От сканировано: " + pages + " страниц.");
    }

    public String getModel() {
        return model;
    }

    public boolean isColorScanner() {
        return colorScanner;
    }

    public void setColorScanner(boolean colorScanner) {
        this.colorScanner = colorScanner;
    }
}
