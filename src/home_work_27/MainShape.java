package home_work_27;

public class MainShape {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        Rectangle rectangle = new Rectangle(23, 93);
        Triangle triangle = new Triangle(3, 5, 5);

        triangle.setSideB(10);

        Shape[] shapes = new Shape[3];
        shapes[0] = circle;
        shapes[1] = rectangle;
        shapes[2] = triangle;

        double areaShapes = 0;
        double perimeterShapes = 0;

        for (Shape currentShape : shapes) {
            System.out.println(currentShape);
            System.out.println("- Area: " + currentShape.calcArea());
            System.out.println("- Perimeter: " + currentShape.calcPerimeter());
            System.out.println("============");
            areaShapes += currentShape.calcArea();
            perimeterShapes += currentShape.calcPerimeter();
        }


        System.out.println("Shapes area: " + areaShapes);
        System.out.println("Shapes perimeter: " + perimeterShapes);

    }
}
