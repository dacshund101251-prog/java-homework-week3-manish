import java.util.Scanner;
public class CheckNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Prompt user for input
        System.out.print("Enter a number: ");
        double number = input.nextDouble();
        // Check if the number is positive, negative, or zero
        if (number > 0) {
            System.out.println("The number is Positive.");
        } else if (number < 0) {
            System.out.println("The number is Negative.");
        } else {
            System.out.println("The number is Zero.");
        }

        input.close();
    }
}

