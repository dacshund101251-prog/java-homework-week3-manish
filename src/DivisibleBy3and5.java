public class DivisibleBy3and5{

    // Main method: program entry point
    public static void main(String[] args) {
            // local method calling contain all logic of finding numbers divisible by 3 and 5
        printDivisibleNumbers();
    }

    // Local method calling
    private static void printDivisibleNumbers() {
        System.out.println("Numbers between 1 and 100 divisible by 3:");
        // Loop through numbers from 1 to 100
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n\nNumbers between 1 and 100 divisible by 5:");
        // Loop through numbers from 1 to 100
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println(); // Move to the next line after printing all numbers
    }
}
