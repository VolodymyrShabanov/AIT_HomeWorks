package home_work_27;

abstract class Shape {
    private final int id;
    private static int counter;

    public Shape() {
        this.id = counter++;
    }
    @Override
    public String toString() {
        return "{Shape: Sh-" + String.format("%02d", id) + "}";
    }

    abstract double calcArea();
    abstract double calcPerimeter();

}
