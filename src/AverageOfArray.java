import java.util.Scanner;

public class AverageOfArray {

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements in the array: ");
        int size = sc.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " array elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        // Call the local method
        calculateAverage(numbers);

        sc.close();//close scannerdtgk
    }
    // Local method containing all the logic
    public static void calculateAverage(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        double average = (double) sum / arr.length;
        System.out.println("Average value of array elements: " + average);
    }
}