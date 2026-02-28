import java.util.Scanner;

public class CalculatorAppLexiconv2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean keepRunning = true;

        while (keepRunning) {

            System.out.print("Enter the first number: ");
            if (!scanner.hasNextDouble()) {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.next();
                continue;
            }
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            if (!scanner.hasNextDouble()) {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.next();
                continue;
            }
            double num2 = scanner.nextDouble();

            System.out.print("Enter an operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            double result;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;

                case '-':
                    result = num1 - num2;
                    break;

                case '*':
                    result = num1 * num2;
                    break;

                case '/':
                    if (num2 == 0) {
                        System.out.println("Error! Division by zero.");
                        continue;
                    }
                    result = num1 / num2;
                    break;

                default:
                    System.out.println("Invalid operator! Please enter +, -, *, or /.");
                    continue;
            }

            System.out.println("The result is: " + result);

            System.out.print("Do you want to calculate again? (yes/no): ");
            String choice = scanner.next();
            if (!choice.equalsIgnoreCase("yes")) {
                keepRunning = false;
            }
        }

        scanner.close();
        System.out.println("Calculator closed. Goodbye!");
    }
}