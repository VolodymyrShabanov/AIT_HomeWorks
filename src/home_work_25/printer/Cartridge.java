package home_work_25.printer;

public class Cartridge {
    private final int id;
    private static int counter;
    private String model;
    private String color;
    private int inkQuantity;

    public Cartridge(String model, String color, int inkQuantity) {
        this.model = model;
        this.color = color;
        this.inkQuantity = inkQuantity;
        this.id = counter++;
    }



    public String getModel() {
        return model;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getInkQuantity() {
        return inkQuantity;
    }

    public void setInkQuantity(int inkQuantity) {
        this.inkQuantity = inkQuantity;
    }
}
