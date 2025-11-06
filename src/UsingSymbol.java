import java.util.Scanner;

public class UsingSymbol {

    // Main method: program entry point
    public static void main(String[] args) {
        // Call the local method that handles all calculator logic
        performCalculation();
    }

    // Local method including all the calculation logic
    private static void performCalculation() {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt user for the first number
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        // Prompt user for the second number
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        // Prompt user for the operator
        System.out.print("Enter operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        // Perform the calculation based on the operator
        if (operator == '+') {
            System.out.println("Result: " + (num1 + num2));
        } else if (operator == '-') {
            System.out.println("Result: " + (num1 - num2));
        } else if (operator == '*') {
            System.out.println("Result: " + (num1 * num2));
        } else if (operator == '/') {
            // Handle division by zero
            if (num2 != 0) {
                System.out.println("Result: " + (num1 / num2));
            } else {
                System.out.println("Error! Division by zero is not allowed.");
            }
        } else {
            // Invalid operator entered
            System.out.println("Invalid operator! Please enter one of +, -, *, /.");
        }


        sc.close();
    }
}

