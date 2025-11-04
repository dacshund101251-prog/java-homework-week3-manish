import java.util.Scanner;

public class LeapYearCheck {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //In put any year
        System.out.println("Enter any year");
        int year = sc.nextInt();
        //check leap year using tenary operator
        String results = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
                ? "Leap Year"
                : "Not a Leap Year";

        // Display result
        System.out.println(year + " is " + results + ".");

        sc.close();

    }
}



