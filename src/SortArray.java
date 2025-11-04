import java.util.Arrays;

public class SortArray {

           public static void main(String[] args) {
            // Numeric array
            int[] numbers = {34, 12, 9, 67, 45, 23, 89};
            // String array
            String[] names = {"John", "Alice", "Bob", "Diana", "Charlie"};
            // Sorting numeric array
            Arrays.sort(numbers);
            // Sorting string array
            Arrays.sort(names);
            // Display sorted numeric array
            System.out.println("Sorted numeric array: " + Arrays.toString(numbers));
            // Display sorted string array
            System.out.println("Sorted string array: " + Arrays.toString(names));
        }
    }

