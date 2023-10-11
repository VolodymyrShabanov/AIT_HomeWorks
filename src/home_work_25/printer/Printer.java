package home_work_25.printer;

public class Printer extends ComputerPeripheral {
    private final int id;
    private static int counter;
    private String model;
    private final String typePrinting;
    private boolean colorPrinting;
    private Cartridge inkQuantity;
    private int paperQuantity;
    private int pageCountPrinted;

    public Printer(String manufacturer,
                   int yearOfManufacture,
                   String model,
                   String typePrinting,
                   boolean colorPrinting,
                   int paperQuantity) {
        super(manufacturer, yearOfManufacture);
        this.id = counter++;
        this.model = model;
        this.typePrinting = typePrinting;
        this.colorPrinting = colorPrinting;
        this.paperQuantity = paperQuantity;
    }

    public String toString () {
        StringBuilder sb = new StringBuilder();
        sb.append("Manufacturer: ").append(getManufacturer())
                .append("model: ").append(model)
                .append("; YoM is - ").append(getYearOfManufacture());

        return sb.toString();
    }



    public void printing (int pages, Cartridge cartridge) {
        super.on();
        super.connected();
        int printPages;
        for (printPages = 0; printPages <= pages; printPages++) {
            paperQuantity--;
            cartridge.setInkQuantity(cartridge.getInkQuantity()-1);
            if (cartridge.getInkQuantity() <=0 || paperQuantity<=0){
                System.out.println("Уровень чернил: " + inkQuantity +"; уровень бумаги: " + paperQuantity);
                break;
            }
        }
        System.out.println("Распечатано: " + (printPages-1) + " страниц.");
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


    public int getPaperQuantity() {
        return paperQuantity;
    }

    public void setColorPrinting(boolean colorPrinting) {
        this.colorPrinting = colorPrinting;
    }


    public void setPaperQuantity(int paperQuantity) {
        this.paperQuantity = paperQuantity;
    }
}
