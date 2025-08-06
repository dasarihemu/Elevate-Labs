import java.util.Scanner;

public class Calculator {

    // Method for addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Method for subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Method for multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Method for division
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("❗ Error: Cannot divide by zero.");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            // Display Menu
            System.out.println("\n===== Simple Calculator =====");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter first number: ");
                double num1 = sc.nextDouble();

                System.out.print("Enter second number: ");
                double num2 = sc.nextDouble();

                double result = 0;

                switch (choice) {
                    case 1 -> result = add(num1, num2);
                    case 2 -> result = subtract(num1, num2);
                    case 3 -> result = multiply(num1, num2);
                    case 4 -> result = divide(num1, num2);
                }

                System.out.println("Result: " + result);
            } else if (choice != 5) {
                System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 5);

        System.out.println("Calculator closed.");
        sc.close();
    }
}

