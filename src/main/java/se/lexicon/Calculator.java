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
            String answer = getString(scanner);

            if (answer.equalsIgnoreCase("Y")) {


                System.out.println("Write the first number to calculate");
                int number1 = getNumber(scanner);
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

    public static String getString(Scanner scanner){
        return scanner.nextLine();
    }

    public static int getNumber(Scanner scanner){
        int number = 0;
        boolean invalidNumber = true;
        while (invalidNumber){
            try{
               String s = scanner.nextLine();
                number = Integer.parseInt(s);
                invalidNumber = false;
            }catch (NumberFormatException ex){
                System.out.println("Invalid, try again");
           }
        }
        return number;
    }
}
