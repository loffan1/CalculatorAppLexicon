import java.util.Scanner;


public class CalculatorAppLexicon {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();


        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();


        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);


        double result = 0;


        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Error! Division by zero.");
                return;
            }
        } else {

            System.out.println("Invalid operator! Please enter +, -, *, or /.");
            return;
        }


        System.out.println("The result is: " + result);
    }
}