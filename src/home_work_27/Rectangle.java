package home_work_27;

public class Rectangle extends Shape {
    private final String id;
    private static int counter;
    private int sideA;
    private int sideB;

    public Rectangle(int sideA, int sideB) {
        this.id = String.format("%02d", counter++) + "/" + String.format("%02d", super.getId());
        if (sideA > 0 && sideB > 0) {
            this.sideA = sideA;
            this.sideB = sideB;
        }
    }

    @Override
    public String toString() {
        return "{Rectangle: Re-" + id + "}";
//        return "{Shape: Sh-" + String.format("%02d", super.getId()) + "}" + "{Rectangle: Re-" + String.format("%02d", id) + "}";
    }

    @Override
    public double calcArea() {
        return sideA * sideB;
    }

    @Override
    public double calcPerimeter() {
        return 2 * (sideA + sideB);
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        if (sideA > 0) {
            this.sideA = sideA;
        }
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        if (sideB > 0) {
            this.sideB = sideB;
        }
    }
}
