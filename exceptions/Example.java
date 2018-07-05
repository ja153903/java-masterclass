package exceptions;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        try {
            int result = divide();
            System.out.println(result);
            // To nest multiple catch blocks
        } catch(ArithmeticException | NoSuchElementException e) {
            System.out.println(e.toString());
            System.out.println("Unable to perform division, autopilot shutting down");
        }
    }

    private static int divide() {
        int x, y;
        //try {
            x = getInt();
            y = getInt();
            return x / y;
//        } catch (NoSuchElementException e) {
//            throw new ArithmeticException("No suitable input");
//        } catch (ArithmeticException e) {
//            throw new ArithmeticException("attempy to divide by zero");
//        }
    }

    private static int getInt() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter an integer: ");

        while (true) {
            try {
                return s.nextInt();
            } catch(InputMismatchException e) {
                // go around again. Read past the end of line in the input first
                s.nextLine();
                System.out.println("Please enter a number using the digits 0 to 9");
            }
        }
    }
}
