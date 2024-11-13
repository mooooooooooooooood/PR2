package PR2.tut5;

public class MovablePoint extends Point{
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint(float x, float y) {
        super(x, y);
    }
    public MovablePoint(){
    }

    public float getxSpeed() {
        return this.xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return this.ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
            this.xSpeed = xSpeed;
            this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] xySpeed = {xSpeed, ySpeed};
        return xySpeed;
    }
    @Override
    public String toString() {
        return super.toString() + ",speed=(" + this.getxSpeed() + "," + this.getySpeed() +")";
    }
    public MovablePoint move(){
        this.setX(this.getX() + this.getxSpeed());
        this.setY(this.getY() + this.getySpeed());
        return this;
    }
}
