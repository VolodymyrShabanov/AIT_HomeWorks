package home_work_27;

public class Circle extends Shape {
    private final String id;
    private static int counter;
    static final double PI = 3.1415926535;
    private int radius;


    public Circle(int radius) {
        this.id = String.format("%02d", counter++) + "/" + String.format("%02d", super.getId());
        if (radius > 0) {
            this.radius = radius;
        }
    }

    @Override
    public String toString() {
        return "{Circle: Ci-" + id + "}";
//        return "{Shape: Sh-" + String.format("%02d", super.getId()) + "}" + "{Circle: Ci-" + String.format("%05d", id) + "}";
    }

    @Override
    public double calcArea() {
        return radius * radius * PI;

    }

    @Override
    public double calcPerimeter() {
        return 2 * radius * PI;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if (radius > 0) {
            this.radius = radius;
        }
    }
}
