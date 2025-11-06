import java.util.Scanner;

public class CityNameAccordingly {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an alphabet from A to F: ");
        char ch = sc.next().toUpperCase().charAt(0);

        // local method calling
        printCityName(ch);

        sc.close();
    }

    // Local method containing all the logic
    public static void printCityName(char ch) {
        if (ch == 'A') {
            System.out.println("A - Amdavad");
        } else if (ch == 'B') {
            System.out.println("B - Bharuch");
        } else if (ch == 'C') {
            System.out.println("C - Chennai");
        } else if (ch == 'D') {
            System.out.println("D - Daman");
        } else if (ch == 'E') {
            System.out.println("E - Eder");
        } else if (ch == 'F') {
            System.out.println("F - Faizabad");
        } else {
            System.out.println("Invalid entry! Please enter an alphabet between A and F.");
        }
    }
}