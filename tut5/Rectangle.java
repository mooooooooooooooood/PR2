package PR2.tut5;

public class Rectangle extends Shape{
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled) {
        super(color, filled);
    }

    public Rectangle (double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        return this.getLength()*this.getWidth();
    }

    public double getPerimeter() {
        return 2*(this.getWidth()+this.getLength());
    }

    @Override
    public String toString(){
        return "Rectangle[" + super.toString() + ",width=" + this.getWidth() + ",length=" + this.getLength() + "]";
    }
}