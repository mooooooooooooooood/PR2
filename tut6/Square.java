package PR2.tut6;

public class Square extends Rectangle{
    private double side = 1.0;
    public Square(){
    }
    public Square(double side) {
        super(side, side);
    }
    public Square (double side, Colors color, boolean filled) {
        super(side, side, color, filled);
    }
    public Square(double side, Colors color, boolean filled, Point2D position) {
        super(side, side, color, filled, position);
    }

    public double getSide() {
        return super.getWidth();
    }

    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public void setWidth(double side) {
        this.setSide(side);
    }

    @Override
    public void setLength(double side) {
        this.setSide(side);
    }
    @Override
    public double getArea(){
        return getSide()*getSide();
    }
    public double getPerimeter(){
        return 4*getSide();
    }

    @Override
    public String toString() {
        return "Square[" + super.toString() + "]";
    }
}
