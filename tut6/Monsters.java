package PR2.tut6;

public abstract class Monsters implements SpecialAbility, Movable {
    private String name;
    private int health = 100;
    private int attackPower = 1;
    private Point2D position = new Point2D();
    public Monsters(){
    }
    public Monsters(String name) {
        this.name = name;
    }
    public Monsters(String name, int health){
        this.name = name;
        this.health = health;
    }
    public Monsters(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }
    public Monsters(String name, int health, int attackPower, Point2D position) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.position = position;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    public void decreaseHealth() {
        this.health--;
    }

    public int getAttackPower() {
        return this.attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }
    public void raiseAttackPower(int amount){
        this.attackPower += amount;
    }

    public Point2D getPosition() {
        return this.position;
    }

    public void setPosition(Point2D position) {
        this.position = position;
    }

    public abstract void attack();

    public String toString(){
        return "Monster " + getName() + " has " + getHealth() + " health, " + getAttackPower() + " attack power and is located at " + getPosition();
    }
}
