package PR2.tut6;

public class MonsterTest {
    public static void main(String[] args) {
        // Declare instances of the superclass (Monster)
        Monster monster1 = new FireMonster();
        Monster monster2 = new WaterMonster();
        Monster monster3 = new StoneMonster();

        // Demonstrate polymorphic behavior by invoking the attack() method
        System.out.println(monster1.attack());
        System.out.println(monster2.attack());
        System.out.println(monster3.attack());
        System.out.println();

        // Reassign one of the superclass instances with a new instance of a subclass
        monster1 = new WaterMonster();
        System.out.println(monster1.attack());
        System.out.println();

        // Handle the scenario where an instance of the superclass is directly created
        Monster genericMonster = new Monster();
        System.out.println(genericMonster.attack()); // Display appropriate message
        System.out.println();

        // Additional scenario: Create an array of Monsters and demonstrate polymorphism
        Monster[] monsters = {new FireMonster(), new WaterMonster(), new StoneMonster()};
        for (Monster monster : monsters) {
            System.out.println(monster.attack());
        }
    }
}
