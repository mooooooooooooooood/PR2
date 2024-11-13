package PR2.tut6;

public class MonstersTest {
    public static void main(String[] args) {
        Goblin goblin = new Goblin("Goblin", 90, 59, new Point2D(5, 8));
        System.out.println(goblin.toString());
        goblin.attack();
        goblin.moveDown();
        System.out.println(goblin.getName() + " now at " + goblin.getPosition());
        goblin.raiseAttackPower(7);
        System.out.println(goblin.getName() + " now has " + goblin.getAttackPower() + " attack power.");
        System.out.println();

        Zombie zombie = new Zombie("Zombie", 65, 40, new Point2D(-4, -6));
        System.out.println(zombie.toString());
        zombie.moveLeft();
        System.out.println(zombie.getName() + " now at " + zombie.getPosition());
        zombie.attack();
        zombie.decreaseHealth();
        System.out.println(zombie.getName() +"'s health decrease to " + zombie.getHealth() +".");
        System.out.println();

        Vampire vampire = new Vampire("Vampire", 100, 70, new Point2D(-6, -10));
        System.out.println(vampire.toString());
        vampire.attack();
        vampire.transform();
        System.out.print(vampire.getName() + " teleport to ");
        vampire.teleport(new Point2D(9, 5));
    }
}
