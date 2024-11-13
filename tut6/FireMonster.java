package PR2.tut6;

public class FireMonster extends Monster{
    public FireMonster(){
    }
    public FireMonster(String name){
        super(name);
    }
    @Override
    public String attack(){
        return "Fire Monsters are burning the houses!";
    }
}
