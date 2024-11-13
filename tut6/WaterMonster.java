package PR2.tut6;

public class WaterMonster extends Monster{
    public WaterMonster(){
    }
    public WaterMonster(String name){
        super(name);
    }
    @Override
    public String attack(){
        return "Water Monsters are destroying the field!";
    }
}
