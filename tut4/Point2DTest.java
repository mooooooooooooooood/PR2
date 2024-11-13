package PR2.tut4;
import java.util.Scanner;
public class Point2DTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter point1's x-, y-coordinates: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        System.out.print("Enter point2's x-, y-coordinates: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        Point2D p1 = new Point2D(x1, y1);
        Point2D p2 = new Point2D(x2, y2);
        System.out.println("p1 is Point2D " + p1);
        System.out.println("p2 is Point2D " + p2);
        System.out.print("The distance between p1 and p2 is " + p1.distance(p2));
        //Hoặc System.out.print("The distance between p1 and p2 is " + p1.distance(x2, y2));
    }
}
