package PR2.tut4;

public class Point2D {
    private double x;
    private double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Method to calculate distance between two points: nhập rõ tọa độ (x,y) của point 2
    public double distance(double x, double y) {
        double X = x - this.x;
        double Y = y - this.y;
        return Math.sqrt(X * X + Y * Y);
    }

    //Method to calculate distance from another Point2D object: nhập point 2
    public double distance(Point2D point) {
        double X = point.x - this.x;
        double Y = point.y - this.y;
        return Math.sqrt(X * X + Y * Y);
    }

    public String toString() {
        return "[x = " + this.x + ", y = " + this.y + "]";
    }
}
