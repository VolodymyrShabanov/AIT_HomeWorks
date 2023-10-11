package home_work_24.printer;

public class Printer extends ComputerPeripheral{
    private final int id;
    private static int counter;
    private String model;
    private final String typePrinting;
    private boolean colorPrinting;
    private int inkQuantity;
    private int paperQuantity;
    private int pageCountPrinted;

    public Printer(String manufacturer,
                   int yearOfManufacture,
                   String model,
                   String typePrinting,
                   boolean colorPrinting,
                   int inkQuantity,
                   int paperQuantity) {
        super(manufacturer, yearOfManufacture);
        this.id = counter++;
        this.model = model;
        this.typePrinting = typePrinting;
        this.colorPrinting = colorPrinting;
        this.inkQuantity = inkQuantity;
        this.paperQuantity = paperQuantity;
    }

    public String toString () {
        StringBuilder sb = new StringBuilder();
        sb.append("Manufacturer: ").append(getManufacturer())
                .append("model: ").append(model)
                .append("; YoM is - ").append(getYearOfManufacture());

        return sb.toString();
    }

    public void printing (int pages) {
        super.on();
        super.connected();
        int printPages;
        for (printPages = 0; printPages <= pages; printPages++) {
            inkQuantity --;
            paperQuantity--;
            if (inkQuantity <=0 || paperQuantity<=0){
                System.out.println("Уровень чернил: " + inkQuantity +"; уровень бумаги: " + paperQuantity);
                break;
            }
        }
        System.out.println("Распечатано: " + printPages + " страниц.");
    }



    public String getModel() {
        return model;
    }

    public String getTypePrinting() {
        return typePrinting;
    }

    public boolean isColorPrinting() {
        return colorPrinting;
    }

    public int getInkQuantity() {
        return inkQuantity;
    }

    public int getPaperQuantity() {
        return paperQuantity;
    }

    public void setColorPrinting(boolean colorPrinting) {
        this.colorPrinting = colorPrinting;
    }

    public void setInkQuantity(int inkQuantity) {
        this.inkQuantity = inkQuantity;
    }

    public void setPaperQuantity(int paperQuantity) {
        this.paperQuantity = paperQuantity;
    }
}
