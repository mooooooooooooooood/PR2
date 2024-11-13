package PR2.tut09.utils;
import PR2.tut09.utils.exceptions.EmptyLineException;
import PR2.tut09.utils.exceptions.InvalidInputException;
import PR2.tut09.utils.exceptions.WordLengthException;
import sun.security.x509.InvalidityDateExtension;

import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.Scanner;
public class TextIO {
    private static Scanner sc = new Scanner(System.in);

    public static int getInt() {
        boolean error = false;
        int input = 0;
        do {
            try {
                Scanner sc =new Scanner(System.in);
                System.out.print("Enter integer : ");
                input = sc.nextInt();
                error=false;
            }
            catch(InputMismatchException e) {
                System.out.println("Invalid input! Enter integer only!");
                error=true;
            }
        }
        while(error);
        return(input);
    }

    public static float getFloat() {
        boolean error = false;
        float input = 0f;
        do {
            try {
                Scanner sc =new Scanner(System.in);
                System.out.print("Enter integer : ");
                input = sc.nextFloat();
                error = false;
            }
            catch(InputMismatchException e) {
                System.err.println("Invalid Input! Enter float numbers only");
                error=true;
            }
        }
        while(error);
        return(input);
    }
    public static String getWord() {
        String input = "";
        while (true) {
            try {
                System.out.print("Enter a word: ");
                input = sc.nextLine().trim();
                if (input == null || input.isEmpty() || input.trim() == " " || input.trim() == "") {
                    throw new WordLengthException("Word cannot be empty or null.");
                } else if (input.length() > 45) {
                    throw new WordLengthException("Word length cannot exceed 45 characters.");
                } else if (!input.matches("[a-zA-Z]+")) {
                    throw new InvalidInputException("Word should consist of only letters (no spaces or punctuation).");
                }
            } catch (InvalidInputException | WordLengthException e) {
                System.err.println("Invalid input!");
                sc.nextLine();
            }
            sc.close();
        }
    }

    public static String getEmail() {
        while (true) {
            System.out.print("Enter an email: ");
            String input = sc.nextLine().trim();
            if (input.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")) {
                return input;
            }
            System.out.println("Invalid email format. Please enter a valid email.");
        }
    }
}

