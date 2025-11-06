import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input number from user
        System.out.print("Enter any number: ");
        int number = input.nextInt();

        // Call the local method
        String result = OddOrEven(number);

        // Display result
        System.out.println("The entered number is " + result + ".");

        input.close();
    }

    // Local method containing all logic
    public static String OddOrEven(int num) {
        if (num % 2 == 0) {
            return "EVEN";
        } else {
            return "ODD";
        }
    }
}




