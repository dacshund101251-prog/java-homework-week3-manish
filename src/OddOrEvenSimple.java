import java.util.Scanner;

public class OddOrEvenSimple {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input number from user
        System.out.print("Enter any number: ");
        int number = input.nextInt();

        // Call the local method
        String result = checkOddEven(number);

        // Display the result
        System.out.println("The entered number is " + result + ".");

        input.close();
    }

    // Local method containing all logic using ternary operator
    public static String checkOddEven(int num) {
        return (num % 2 == 0) ? "EVEN" : "ODD";
    }
}


