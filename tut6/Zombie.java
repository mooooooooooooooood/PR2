package PR2.tut6;

public class Zombie extends Monsters{
    public Zombie(String name) {
        super(name);
    }
    public Zombie(String name, int health){
        super(name, health);
    }
    public Zombie(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }
    public Zombie(String name, int health, int attackPower, Point2D position) {
        super(name, health, attackPower, position);
    }
    @Override
    public void attack(){
        System.out.println(getName() + " is chasing citizens!");
    }

    @Override
    public void moveUp() {
        getPosition().setY(getPosition().getY() + 1);
        System.out.println(getName() + " is moving up.");
    }

    @Override
    public void moveDown() {
        getPosition().setY(getPosition().getY() - 1);
        System.out.println(getName() + " is moving down.");
    }

    @Override
    public void moveLeft() {
        getPosition().setX(getPosition().getX() + 1);
        System.out.println(getName() + " is moving left.");
    }

    @Override
    public void moveRight() {
        getPosition().setX(getPosition().getX() + 1);
        System.out.println(getName() + " is moving right.");
    }

    @Override
    public void transform() {
            System.out.println(getName() + " is transforming to vampire!");
    }

    @Override
    public void teleport(Point2D newPosition) {
        System.out.println(getName() + " is teleporting to position: " + newPosition);
        getPosition().setX(newPosition.getX());
        getPosition().setY(newPosition.getY());
    }
}
