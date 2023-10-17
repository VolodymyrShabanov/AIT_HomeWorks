package home_work_27;

public class Triangle extends Shape {
    private final String id;
    private static int counter;
    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle(int sideA, int sideB, int sideC) {
        this.id = String.format("%02d", counter++) + "/" + String.format("%02d", super.getId());
        if (sideA > 0 && sideB > 0 && sideC > 0) {
            if (isValidSides(sideA, sideB, sideC)) {
                this.sideA = sideA;
                this.sideB = sideB;
                this.sideC = sideC;
            }
        }
    }

    public boolean isValidSides(double sideA, double sideB, double sideC) {
        return (sideA + sideB) > sideC && (sideB + sideC) > sideA && (sideA + sideC) > sideB;

    }

    @Override
    public String toString() {
        return "{Triangle: Tr-" + id + "}";
//        return "{Shape: Sh-" + String.format("%02d", super.getId()) + "}" + "{Triangle: Tr-" + String.format("%02d", id) + "}";
    }

    @Override
    public double calcArea() {
        double semiPerimeter = calcPerimeter() / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - sideA)
                * (semiPerimeter - sideB)
                * (semiPerimeter - sideC));
    }

    @Override
    public double calcPerimeter() {
        return sideA + sideB + sideC;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        if (sideA > 0 && sideA < (sideB + sideC)) {
            this.sideA = sideA;
        }
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        if (sideB > 0 && sideB < (sideA + sideC)) {
            this.sideB = sideB;
        }
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        if (sideC > 0 && sideC < (sideA + sideB)) {
            this.sideC = sideC;
        }
    }
}
