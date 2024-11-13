package PR2.tut4;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(3.4f, 1.2f);
        Rectangle r2 = new Rectangle();
        Rectangle r3 = new Rectangle(5.6f, 7.8f);
        System.out.println(r1); //in toString
        System.out.println(r2);
        System.out.println(r3);
        System.out.println("Length is: " + r3.getLength());
        System.out.println("Width is: " + r3.getWidth());
        System.out.println("Area is: " + r3.getArea());
        System.out.println("Perimeter is: " + r3.getPerimeter());
    }
}
