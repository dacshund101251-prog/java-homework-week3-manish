
import java.util.Scanner;

public class AlphabetOrSymbol {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a single character: ");
        char ch = scanner.next().charAt(0); // reads the first character

        // Call the separate method and print the result
        String result = checkCharacterType(ch);
        System.out.println(result);

        scanner.close();//close scanner
    }

    // Method to check the type of character
    public static String checkCharacterType(char ch) {
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            return "The entered character is an ALPHABET.";
        }
        else if (ch >= '0' && ch <= '9') {
            return "The entered character is a NUMBER.";
        }
        else {
            return "The entered character is a SYMBOL.";

        }
    }



}


