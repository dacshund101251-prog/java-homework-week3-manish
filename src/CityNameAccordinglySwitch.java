import java.util.Scanner;

public class CityNameAccordinglySwitch {

    // Main method: program entry point
    public static void main(String[] args) {
        // Call local method to handle city selection logic
        handleCitySelection();
    }

    // Local method: handles all logic
    private static void handleCitySelection() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an alphabet from A to F: ");
        char ch = sc.next().toUpperCase().charAt(0);

        switch (ch) {
            case 'A':
                System.out.println("A - Amdavad");
                break;
            case 'B':
                System.out.println("B - Bharuch");
                break;
            case 'C':
                System.out.println("C - Chennai");
                break;
            case 'D':
                System.out.println("D - Daman");
                break;
            case 'E':
                System.out.println("E - Eder");
                break;
            case 'F':
                System.out.println("F - Faizabad");
                break;
            default:
                System.out.println("Invalid entry! Please enter an alphabet between A and F.");
        }

        sc.close();
    }
}



