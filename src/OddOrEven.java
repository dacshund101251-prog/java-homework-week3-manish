import java.util.Scanner;

public class OddOrEven{
    public static void main(String[] args) {
        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Ask the user for a number
        System.out.print("Enter number: ");
        int number = sc.nextInt();

        // Check if the number is even or odd
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }

        sc.close();
    }
}



