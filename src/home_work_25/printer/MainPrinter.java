package home_work_25.printer;

public class MainPrinter {
    public static void main(String[] args) {
        Printer printer = new Printer("HP", 2023, "MP-102", "laser", true, 100);
        Cartridge cartridge = new Cartridge("nn" , "lsdjf" , 50);

        System.out.println(cartridge.getInkQuantity());

        printer.printing(34, cartridge);
        System.out.println(printer.getPaperQuantity());

        printer.printing(40, cartridge);
        System.out.println(printer.getPaperQuantity());


    }
}
