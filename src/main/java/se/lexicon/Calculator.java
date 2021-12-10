package se.lexicon;
import java.util.Scanner;

/**
 * handles basic operations such as addition,
 * subtraction, multiplication and division.
 * The result of each operation is presented in a consistent way.
 * The program don't stop running until the User choose to end it
 * by terminating the loop.
 */
public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to calculator, write the first number");
        int number1 = scanner.nextInt();
        System.out.println("Write one of the four operations +,-,*,/");
        String operation = scanner.next();
        System.out.println("Write the second number");
        int number2 = scanner.nextInt();

        switch (operation) {

            case "-":
                System.out.println(number1 - number2);
                break;
            case "/":
                System.out.println(number1 / number2);
                break;
            case "+":
                System.out.println(number1 + number2);
                break;
            case "*":
                System.out.println(number1 * number2);
                break;
            default:
                System.out.println("try again");
        }

    }

}
