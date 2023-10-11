package home_work_24.printer;

public class MainPrinter {
    public static void main(String[] args) {
        Printer printer = new Printer("HP", 2023, "MP-102", "laser", true, 10, 15);

        printer.printing(34);
        System.out.println(printer.getPaperQuantity());


    }
}
