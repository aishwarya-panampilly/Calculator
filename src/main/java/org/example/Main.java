package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Scientific Calculator Menu");
            System.out.println("1. Square Root (√x)");
            System.out.println("2. Factorial (x!)");
            System.out.println("3. Natural Logarithm (ln(x))");
            System.out.println("4. Power Function (x^b)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            System.out.flush();
            int choice = scanner.nextInt();
            System.out.println();

            switch (choice) {
                case 1:

                    System.out.print("Enter a number (x) to calculate √x: ");
                    double x = scanner.nextDouble();
                    if (x < 0) {
                        System.out.println("Cannot calculate the square root of a negative number.");
                    } else {
                        System.out.println("Square root of " + x + " = " + Math.sqrt(x));
                    }
                    break;
                case 2:

                    System.out.print("Enter a non-negative integer for factorial (x!): ");
                    int n = scanner.nextInt();
                    if (n < 0) {
                        System.out.println("Factorial is not defined for negative numbers.");
                    } else {
                        System.out.println(n + "! = " + factorial(n));
                    }
                    break;
                case 3:

                    System.out.print("Enter a positive number (x) to calculate ln(x): ");
                    double num = scanner.nextDouble();
                    if (num <= 0) {
                        System.out.println("Natural logarithm is defined only for positive numbers.");
                    } else {
                        System.out.println("ln(" + num + ") = " + Math.log(num));
                    }
                    break;
                case 4:

                    System.out.print("Enter the base (x): ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter the exponent (b): ");
                    double exponent = scanner.nextDouble();
                    System.out.println(base + " raised to the power " + exponent + " = " + Math.pow(base, exponent));
                    break;
                case 5:

                    System.out.println("Exiting Calculator. Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }

            System.out.println(); // Blank line for spacing between operations
        }
    }

    // Helper method to calculate factorial of a non-negative integer
    public static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
