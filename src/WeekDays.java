import java.util.Scanner;
//main method
public class WeekDays {
    public static void main(String[] args) {

        weekdayscoutning();// main method calling

    }
    //local method
    public static void weekdayscoutning(){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (1-7): ");
        int day = sc.nextInt();

        switch(day) {
            case 1:
                System.out.println("MONDAY");
                break;
            case 2:
                System.out.println("TUESDAY");
                break;
            case 3:
                System.out.println("WEDNESDAY");
                break;
            case 4:
                System.out.println("THURSDAY");
                break;
            case 5:
                System.out.println("FRIDAY");
                break;
            case 6:
                System.out.println("SATURDAY");
                break;
            case 7:
                System.out.println("SUNDAY");
                break;
            default:
                System.out.println("Week contains 1 to 7 days");
        }

        sc.close();
    }
}



