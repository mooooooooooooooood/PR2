package PR2.tut1;
import java.util.Scanner;

public class GreetingUpperCaseName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.print("Enter your name: ");
        name = sc.nextLine();
        if (name == null) {
            System.out.print("Name cannot be null!");
        } else if (name == " ") {
            System.out.print("Please provide a valid name!");
        } else if (name.matches(".*\\d.*")) {
            System.out.print("Invalid input. Please try again!");
        } else {
        String upperCaseName = name.toUpperCase();
        System.out.print("Hello, " + upperCaseName + ", nice to meet you!" );
        }
    }
}
