public class NumberOfDaysInMonths {

    // Main method
    public static void main(String[] args) {
        // calling local method
        demonstrateMonthDays();
    }

    // Local method
    private static void demonstrateMonthDays() {
        // Test isLeapYear method
        System.out.println("isLeapYear(-1600): " + isLeapYear(-1600)); // false
        System.out.println("isLeapYear(1600): " + isLeapYear(1600));   // true
        System.out.println("isLeapYear(2017): " + isLeapYear(2017));   // false
        System.out.println("isLeapYear(2000): " + isLeapYear(2000));   // true

        // Test getDaysInMonth method
        System.out.println("getDaysInMonth(1, 2020): " + getDaysInMonth(1, 2020));  // 31
        System.out.println("getDaysInMonth(2, 2020): " + getDaysInMonth(2, 2020));  // 29
        System.out.println("getDaysInMonth(2, 2018): " + getDaysInMonth(2, 2018));  // 28
        System.out.println("getDaysInMonth(-1, 2020): " + getDaysInMonth(-1, 2020)); // -1
        System.out.println("getDaysInMonth(1, -2020): " + getDaysInMonth(1, -2020)); // -1
    }

    // Method to check leap year
    public static boolean isLeapYear(int year) {
        // Validate the year
        if (year < 1 || year > 9999) {
            return false;
        }

        // Leap year logic: divisible by 4 and not 100, or divisible by 400
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to get number of days in a month
    public static int getDaysInMonth(int month, int year) {
        // Validate input
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        }

        int days;

        // Determine number of days based on month
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;

            case 2:
                // February depends on leap year
                days = isLeapYear(year) ? 29 : 28;
                break;

            default:
                days = -1; // should never occur due to validation
        }

        return days;
    }
}

