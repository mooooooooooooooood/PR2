package PR2.tut2;

public class DiceRollStimulate {
    public static void main(String[] args) {
        int dice1 = (int)(Math.random()*6) + 1;
        int dice2 = (int)(Math.random()*6) + 1;
        int total = dice1 + dice2;

        System.out.println("The first die comes up "+ dice1);
        System.out.println("The second die comes up "+ dice2);
        System.out.println("Your total roll is "+ total);
    }
}