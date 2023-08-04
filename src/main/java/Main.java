import calculator.Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to cip calculator");
        System.out.println("please Enter your first number");

        while (!scanner.hasNextInt()) {
            System.out.println("Input is not a number.");
            scanner.nextLine();
        }
        int number1 = scanner.nextInt();

        System.out.println("please Enter your second number");
        while (!scanner.hasNextInt()) {
            System.out.println("Input is not a number.");
            scanner.nextLine();
        }
        int number2 = scanner.nextInt();

        System.out.println("Chose and type you operator: * ^ / +");
        String operator = scanner.next();
        while (!inputChecker(operator)) {
            System.out.println("Input valid operator");
            operator = scanner.next();
        }

        Calculator calculator = new Calculator();
        int result = calculator.calculate(number1, number2, operator.charAt(0));

        System.out.println("your Result is : " + result);
    }

    private static boolean inputChecker(String operator) {
        return operator.equals("*") || operator.equals("^") || operator.equals("/") || operator.equals("+");
    }
}
