public class AverageOfArray {


    public static void main(String[] args) {
        // Example array multidimensional
        int[] numbers = {100, 200, 300, 400, 500};

        int sum = 0;
        double average;


        // Calculate sum of all elements
        for (int num : numbers) {
            sum += num;
        }

        // Compute average (cast to double for decimal precision)
        average = (double) sum / numbers.length;

        // Display the result
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average value of array elements: " + average);
    }
}

