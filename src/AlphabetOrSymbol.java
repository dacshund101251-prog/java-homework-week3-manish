import java.util.Scanner;
public class AlphabetOrSymbol {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Prompt user for input
        System.out.print("Enter a single character: ");
        char ch = input.next().charAt(0); // reads the first character
        // Check if character is an alphabet
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println("The entered character is an ALPHABET.");
        }
        // Check if character is a digit
        else if (ch >= '0' && ch <= '9') {
            System.out.println("The entered character is a NUMBER.");
        }
        // Otherwise, it's a symbol
        else {
            System.out.println("The entered character is a SYMBOL.");
        }

        input.close();
    }
}

