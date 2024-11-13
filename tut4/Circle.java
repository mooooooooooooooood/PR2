package PR2.tut4;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
        //default radius, color
    }
    public Circle (double radius) {
        this.radius = radius;
        //default color
    }
    public Circle (double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }
}
