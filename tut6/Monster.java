package PR2.tut6;

public class Monster {
    private String name;
    public Monster(){
    }
    public Monster(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String attack(){
        return "Monsters are attacking!";
    }
}
