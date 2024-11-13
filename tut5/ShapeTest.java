package PR2.tut5;

public class ShapeTest {
    public static void main(String[] args) {
        Circle circle = new Circle(2, "blue", true);
        System.out.println(circle.toString());
        Rectangle rectangle = new Rectangle(3, 5, "brown", false);
        System.out.println(rectangle.toString());
        Square square = new Square(4, "blue", false);
        System.out.println(square.toString());
    }
}
