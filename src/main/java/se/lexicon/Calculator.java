package se.lexicon;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * handles basic operations: addition,
 * subtraction, multiplication and division.
 * The result of each operation is presented in a consistent way.
 * The program don't stop running until the User choose to end it
 * by terminating the loop.
 * It handles Exceptions
 */

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true){

            System.out.println("Type 'Y' to start calculate");
            String answer = scanner.next();

            if (answer.equalsIgnoreCase("Y")) {


                System.out.println("Write the first number to calculate");
                int number1 = scanner.nextInt();
                System.out.println("Write one of the four operations +,-,*,/");
                String operation = getString(scanner);
                System.out.println("Write the second number");
                int number2 = getNumber(scanner);

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
            }else {
                break;
            }
        }
        System.out.println("You just end it!");
    }

}
