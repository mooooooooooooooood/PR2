package PR2.tut6;

public class StoneMonster extends Monster{
    public StoneMonster(){
    }
    public StoneMonster(String name){
        super(name);
    }
    @Override
    public String attack(){
        return "Stone Monsters are smashing!";
    }
}
