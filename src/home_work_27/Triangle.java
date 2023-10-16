package home_work_27;

public class Triangle extends Shape {
    private final int id;
    private static int counter;
    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle(int sideA, int sideB, int sideC) {
        this.id = counter++;
        if (sideA > 0 && sideB > 0 && sideC > 0) {
            if ((sideA + sideB) > sideC && (sideB + sideC) > sideA && (sideA + sideC)> sideB) {
                this.sideA = sideA;
                this.sideB = sideB;
                this.sideC = sideC;
            }
        }
    }

    @Override
    public String toString() {
        return super.toString() + "{Triangle: Tr-" + String.format("%02d", id) + "}";
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
