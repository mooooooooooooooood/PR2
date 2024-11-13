package PR2.tut4;

public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(2.0, "blue");
        System.out.println("c1: Radius: " +c1.getRadius() +" ;Color: " + c1.getColor());
        System.out.println("c1 area: " +c1.getArea());
        Circle c2 = new Circle(2.0);
        System.out.println("c2: Radius: " +c2.getRadius() +" ;Color: " + c2.getColor());
        System.out.println("c2 area: " +c2.getArea());
        Circle c3 = new Circle();
        System.out.println("c3: Radius: " +c3.getRadius() +" ;Color: " + c3.getColor());
        System.out.println("c3 area: " +c3.getArea());
    }
}
