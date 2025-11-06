import java.util.Arrays;

public class SortArray {

    // Main method: program entry point
    public static void main(String[] args) {
        //  local method Calling that include sorting and displaying arrays
        sortAndDisplayArrays();
    }

    // Local method:
    private static void sortAndDisplayArrays() {
        // Numeric array
        int[] numbers = {34, 12, 9, 67, 45, 23, 89};

        // String array
        String[] names = {"JITU", "Divyesh", "GAURANG", "Dimple", "KASMIRA"};

        //  numeric rarray in ascending order
        Arrays.sort(numbers);

        // string array in alphabetical order
        Arrays.sort(names);

        // Display sorted numeric array
        System.out.println("Sorted numeric array: " + Arrays.toString(numbers));

        // Display sorted string array
        System.out.println("Sorted string array: " + Arrays.toString(names));
    }
}


