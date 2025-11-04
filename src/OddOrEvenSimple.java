import java.util.Scanner;

    public class OddOrEvenSimple {
        public static void main(String[] args) {
            // Create Scanner object for user input
            Scanner input = new Scanner(System.in);

            // Ask the user for a number
            System.out.print("Enter a number: ");
            int number = input.nextInt();

            // Use ternary operator to determine if number is odd or even
            String result = (number % 2 == 0) ? "even" : "odd";

            // Display the result
            System.out.println(number + " is " + result + ".");

            // Close the scanner
            input.close();
        }
    }

