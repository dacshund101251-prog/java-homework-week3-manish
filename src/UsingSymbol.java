import java.util.Scanner;

public class UsingSymbol {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();



        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        // Input operator
        System.out.print("Enter operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        // Perform operation using if-else
        if (operator == '+') {
            System.out.println("Result: " + (num1 + num2));
        } else if (operator == '-') {
            System.out.println("Result: " + (num1 - num2));
        } else if (operator == '*') {
            System.out.println("Result: " + (num1 * num2));
        } else if (operator == '/') {
            // Handle division by zero
            if (num2 != 0)
                System.out.println("Result: " + (num1 / num2));
            else
                System.out.println("Error! Division by zero is not allowed.");
        } else {
            System.out.println("Invalid operator! Please enter one of +, -, *, /.");
        }

        sc.close();
    }
}


