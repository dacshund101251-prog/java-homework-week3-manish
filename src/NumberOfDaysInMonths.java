public class NumberOfDaysInMonths {
           // Method to check if a year is a leap year
        public static boolean isLeapYear(int year) {
            // Check if year is in valid range
            if (year < 1 || year > 9999) {
                return false;
            }

            // Leap year logic
            return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        }

        // Method to get number of days in a month
        public static int getDaysInMonth(int month, int year) {
            // Validate input
            if (month < 1 || month > 12 || year < 1 || year > 9999) {
                return -1;
            }

            int days;

            // Use switch to determine days in month
            switch (month) {
                case 1:  // January
                case 3:  // March
                case 5:  // May
                case 7:  // July
                case 8:  // August
                case 10: // October
                case 12: // December
                    days = 31;
                    break;

                case 4:  // April
                case 6:  // June
                case 9:  // September
                case 11: // November
                    days = 30;
                    break;

                case 2:  // February
                    if (isLeapYear(year)) {
                        days = 29;
                    } else {
                        days = 28;
                    }
                    break;

                default:
                    days = -1; // should never reach here due to validation
            }

            return days;
        }

        // Main method to test
        public static void main(String[] args) {
            System.out.println("isLeapYear(-1600): " + isLeapYear(-1600)); // false
            System.out.println("isLeapYear(1600): " + isLeapYear(1600));   // true
            System.out.println("isLeapYear(2017): " + isLeapYear(2017));   // false
            System.out.println("isLeapYear(2000): " + isLeapYear(2000));   // true

            System.out.println("getDaysInMonth(1, 2020): " + getDaysInMonth(1, 2020));  // 31
            System.out.println("getDaysInMonth(2, 2020): " + getDaysInMonth(2, 2020));  // 29
            System.out.println("getDaysInMonth(2, 2018): " + getDaysInMonth(2, 2018));  // 28
            System.out.println("getDaysInMonth(-1, 2020): " + getDaysInMonth(-1, 2020)); // -1
            System.out.println("getDaysInMonth(1, -2020): " + getDaysInMonth(1, -2020)); // -1
        }
    }


