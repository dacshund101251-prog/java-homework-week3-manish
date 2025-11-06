import java.util.Scanner;


public class CheckArrayValue {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the number of elements in the array: ");
        int size = input.nextInt();

        int[] arr = new int[size];

        // Input array elements
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        // Input the value to search for
        System.out.print("Enter the value to search: ");
        int value = input.nextInt();

        // local method calling
        boolean found = containsValue(arr, value);

        // Display result
        if (found) {
            System.out.println(value + " is present in the array.");
        } else {
            System.out.println(value + " is NOT present in the array.");
        }

        input.close();
    }

    // Local method that contains all logic
    public static boolean containsValue(int[] array, int value) {
        for (int element : array) {
            if (element == value) {
                return true; // Value found
            }
        }
        return false; // Value not found
    }
}



