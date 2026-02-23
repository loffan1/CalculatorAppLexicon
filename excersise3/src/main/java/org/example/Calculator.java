package org.example;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();


        double sum = num1 + num2;
        double multiplication = num1 * num2;
        double division = num2 != 0 ? num1 / num2 : Double.NaN;
        double subtraction = num1 - num2;


        System.out.printf("%.2f + %.2f = %.2f%n", num1, num2, sum);
        System.out.printf("%.2f * %.2f = %.2f%n", num1, num2, multiplication);
        if (num2 != 0) {
            System.out.printf("%.2f / %.2f = %.2f%n", num1, num2, division);
        } else {
            System.out.println("Division by zero is not allowed.");
        }
        System.out.printf("%.2f - %.2f = %.2f%n", num1, num2, subtraction);


    }
}



