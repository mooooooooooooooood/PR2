package PR2.tut2;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ChangeCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1 dollar = 100 cents
        int quarters; // = 25 cents
        int dimes; // = 10 cents
        int nickels; // = 5 cents
        int pennies; // = 1 cent

        System.out.print("Enter the number of quarters: ");
        quarters = scanner.nextInt();

        System.out.print("Enter the number of dimes: ");
        dimes = scanner.nextInt();

        System.out.print("Enter the number of nickels: ");
        nickels = scanner.nextInt();

        System.out.print("Enter the number of pennies: ");
        pennies = scanner.nextInt();

        int cent = quarters*25 + dimes*10 + nickels*5 + pennies;
        System.out.println("You have " + cent + " cents.");

        double dollars = (double) cent / 100;
        System.out.print("You have $"+ dollars);
    }
}