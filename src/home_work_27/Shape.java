package home_work_27;

abstract class Shape {
    private final int id;
    private static int counter;

    public Shape() {
        this.id = counter++;
    }
    abstract double calcArea();
    abstract double calcPerimeter();

    public int getId() {

        return id;
    }
}
