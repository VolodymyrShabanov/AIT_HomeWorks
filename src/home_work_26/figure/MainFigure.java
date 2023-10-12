package home_work_26.figure;

public class MainFigure {
    public static void main(String[] args) {
        Figure figure = new Figure();
        System.out.println(figure.calculateArea());

        Circle circle = new Circle(23);
        System.out.println(circle.calculateArea());

        Square square = new Square(33);
        System.out.println(square.calculateArea());

        Triangle triangle = new Triangle(12, 8);
        System.out.println(triangle.calculateArea());

        Figure[] figures = new Figure[3];
        figures[0] = circle;
        figures[1] = square;
        figures[2] = triangle;

        for (Figure currentFigure : figures) {
            System.out.println(currentFigure.getClass().getName());
            System.out.println(currentFigure.calculateArea());
        }

    }
}
