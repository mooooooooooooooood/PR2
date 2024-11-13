package PR2.tut6;

public class Shape2DTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle(2, Colors.Black, false);
        System.out.println("Circle 1: ");
        System.out.println(circle1.toString());
        System.out.println("Area=" + circle1.getArea());
        System.out.println("Perimeter=" + circle1.getPerimeter());
        System.out.println();

        Circle circle2 = new Circle(3, Colors.Red, true, new Point2D(-1, 5));
        System.out.println("Circle 2: ");
        System.out.println(circle2.toString());
        System.out.println("Area=" + circle2.getArea());
        System.out.println("Perimeter=" + circle2.getPerimeter());
        System.out.println();

        Rectangle rectangle1 = new Rectangle(5, 3);
        System.out.println("Rectangle 1:");
        System.out.println(rectangle1.toString());
        System.out.println("Area="+rectangle1.getArea());
        System.out.println("Perimeter="+rectangle1.getPerimeter());
        System.out.println();

        Rectangle rectangle2 = new Rectangle(7, 2, Colors.Brown, false, new Point2D(9, 2));
        System.out.println("Rectangle 2:");
        System.out.println(rectangle2.toString());
        System.out.println("Area="+rectangle2.getArea());
        System.out.println("Perimeter="+rectangle2.getPerimeter());
        System.out.println();

        Square square1 = new Square();
        System.out.println("Square 1:");
        System.out.println(square1.toString());
        System.out.println("Area="+square1.getArea());
        System.out.println("Perimeter="+square1.getPerimeter());
        System.out.println();

        Square square2 = new Square(6, Colors.Green, true, new Point2D(7, -4));
        System.out.println("Square 2:");
        System.out.println(square2.toString());
        System.out.println("Area="+square2.getArea());
        System.out.println("Perimeter="+square2.getPerimeter());
        System.out.println();
    }
}
