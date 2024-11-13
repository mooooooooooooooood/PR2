package PR2.tut1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EggsCount {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        boolean gotIt = false;
        while (true) {
            try {
                System.out.print("How many eggs do you have? ");
                n = sc.nextInt();
                if (n <= 0) {
                    System.out.print("Please enter a positive integer!");
                    System.out.println();
                } else break;
            }  catch (InputMismatchException inputMismatchException) {
                System.out.println("Please enter a valid input!");
                sc.nextLine();
            }
        }
        int grossEggs = n/144;
        n = n % 144;
        int dozenEggs = n/12;
        int eggLeft = n % 12;
        System.out.print("Your number of eggs is " + grossEggs + " gross, " + dozenEggs + " dozen, and " + eggLeft);
        sc.close();
    }
}
