package PR2.tut6;

public class Rectangle extends Shape2D{
    private double length = 1.0;
    private double width = 1.0;
    public Rectangle(){
    }
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public Rectangle(double length, double width, Colors color, boolean filled) {
        super(color, filled, null);
        this.length = length;
        this.width = width;
    }
    public Rectangle(double length, double width, Colors color, boolean filled, Point2D position) {
        super(color, filled, position);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    @Override
    public double getArea(){
        return getLength()*getWidth();
    }

    @Override
    public double getPerimeter() {
        return 2*(getWidth()+getLength());
    }
    @Override
    public String toString(){
        return "Rectangle[" + super.toString() + ",width=" + this.getWidth() + ",length=" + this.getLength() + "]";
    }
}
