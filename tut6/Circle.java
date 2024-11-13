package PR2.tut6;
public class Circle extends Shape2D{
    private double radius = 1.0;
    public Circle() {
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, Colors color, boolean filled) {
        super(color, filled, null);
        this.radius = radius;
    }
    public Circle(double radius, Colors color, boolean filled, Point2D position) {
        super(color, filled, position);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea(){
        return getRadius()*getRadius()*Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2*getRadius()*Math.PI;
    }
    @Override
    public String toString(){
        return "Circle[" + super.toString() + ",radius=" + this.getRadius() + "]";
    }
}
