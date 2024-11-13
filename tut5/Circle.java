package PR2.tut5;

public class Circle extends Shape{
    private double radius = 1.0;
    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle (double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return this.getRadius()*this.getRadius()*Math.PI;
    }

    public double getPerimeter(){
        return 2*this.getRadius()*Math.PI;
    }

    @Override
    public String toString(){
        return "Circle[" + super.toString() + ",radius=" + this.getRadius() + "]";
    }
}
