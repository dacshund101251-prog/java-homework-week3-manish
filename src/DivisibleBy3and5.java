public class DivisibleBy3and5 {
    public static void main(String[] args) {

        System.out.println("Numbers divisible by 3:");
        for (int a = 1; a <= 100; a++) {
            if (a % 3 == 0) {
                System.out.print(a + " ");
            }
        }

        System.out.println("\n\nNumbers divisible by 5:");
        for (int a = 1; a <= 100; a++) {
            if (a % 5 == 0) {
                System.out.print(a + " ");
            }
        }
    }
}

