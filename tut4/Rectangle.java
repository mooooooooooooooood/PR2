package PR2.tut4;

public class Rectangle {
    private float length = 1.0f;
    private float width = 1.0f;

    //constructors
    public Rectangle(){
    }
    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    //getters and setters
    public float getLength() {
        return length;
    }
    public void setLength(float length) {
        this.length = length;
    }
    public float getWidth() {
        return width;
    }
    public void setWidth(float width) {
        this.width = width;
    }
    //tính diện tích
    public double getArea() {
        return length*width;
    }
    //tính chu vi
    public double getPerimeter() {
        return 2*(length+width);
    }
    public String toString(){
        return "Rectangle[width=" + this.width +",height=" + this.length + "]";
    }
}
