public class CheckArrayValue {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};  // Example array single dimensional
        int target = 20;  // Value to check

        boolean found = false;
        for (int num : numbers) {
            if (num == target) { found = true;
                break;
            }
        }

        if (found) {
            System.out.println(target + " is found in the array.");
        } else {
            System.out.println(target + " is NOT found in the array.");
        }
    }
}




