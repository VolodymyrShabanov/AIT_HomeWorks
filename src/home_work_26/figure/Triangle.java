package home_work_26.figure;

public class Triangle extends Figure{
    private int side;
    private int height;

    public Triangle(int side, int height) {
        this.side = side;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        double area = 0.5 * side * height;
        return area;
    }


    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
