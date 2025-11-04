public class SumValueOfArray{
    public static void main(String[] args) {
        // Example array
        int[] numbers = {10, 20, 30, 40, 50};

        int sum = 0;

        // Loop through each element and add to sum
        for (int a = 0; a < numbers.length; a++) {
            sum += numbers[a];
        }

        // Display the result
        System.out.println("Sum of array elements: " + sum);
    }
}

