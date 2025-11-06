import java.util.Scanner;

public class CheckNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input number from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Call the local method and get the result
        String result = checkNumberType(number);

        // Display result
        System.out.println("The entered number is " + result + ".");

        input.close();
    }

    // Local method containing all logic
    public static String checkNumberType(int num) {
        if (num > 0) {
            return "POSITIVE";
        } else if (num < 0) {
            return "NEGATIVE";
        } else {
            return "ZERO";
        }
    }
}




