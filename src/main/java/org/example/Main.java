package org.example;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("Scientific Calculator Menu");
            System.out.println("1. Square Root (√x)");
            System.out.println("2. Factorial (x!)");
            System.out.println("3. Natural Logarithm (ln(x))");
            System.out.println("4. Power Function (x^b)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            System.out.flush();

            int choice;
            try {
                choice = Integer.parseInt(reader.readLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }

            System.out.println();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number (x) to calculate √x: ");
                    System.out.flush();
                    double x = Double.parseDouble(reader.readLine().trim());
                    if (x < 0) {
                        System.out.println("Cannot calculate the square root of a negative number.");
                    } else {
                        System.out.println("Square root of " + x + " = " + Math.sqrt(x));
                    }
                    break;

                case 2:
                    System.out.print("Enter a non-negative integer for factorial (x!): ");
                    System.out.flush();
                    int n = Integer.parseInt(reader.readLine().trim());
                    if (n < 0) {
                        System.out.println("Factorial is not defined for negative numbers.");
                    } else {
                        System.out.println(n + "! = " + factorial(n));
                    }
                    break;

                case 3:
                    System.out.print("Enter a positive number (x) to calculate ln(x): ");
                    System.out.flush();
                    double num = Double.parseDouble(reader.readLine().trim());
                    if (num <= 0) {
                        System.out.println("Natural logarithm is defined only for positive numbers.");
                    } else {
                        System.out.println("ln(" + num + ") = " + Math.log(num));
                    }
                    break;

                case 4:
                    System.out.print("Enter the base (x): ");
                    System.out.flush();
                    double base = Double.parseDouble(reader.readLine().trim());
                    System.out.print("Enter the exponent (b): ");
                    System.out.flush();
                    double exponent = Double.parseDouble(reader.readLine().trim());
                    System.out.println(base + " raised to the power " + exponent + " = " + Math.pow(base, exponent));
                    break;

                case 5:
                    System.out.println("Exiting Calculator. Goodbye!");
                    reader.close();
                    System.exit(0);
                    return;

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
