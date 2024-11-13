package PR2.tut6;

public class Point2D {
    private double x = 0.0;
    private double y = 0.0;
    public Point2D() {
    }
    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Method to calculate distance between two points: nhập rõ tọa độ (x,y) của point 2
    public double getDistanceTo(double x, double y) {
        double X = x - this.x;
        double Y = y - this.y;
        return Math.sqrt(X * X + Y * Y);
    }

    //Method to calculate distance from another Point2D object: nhập point 2
    public double getDistanceTo(Point2D point) {
        double X = point.x - this.x;
        double Y = point.y - this.y;
        return Math.sqrt(X * X + Y * Y);
    }
    public String toString(){
        return "Point2D[x="+getX()+",y=" +getY() +"]";
    }
}