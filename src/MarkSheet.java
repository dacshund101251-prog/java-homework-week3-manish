import java.util.Scanner;

public class MarkSheet {

    // Main method: program entry point
    public static void main(String[] args) {
        // Call the local method that contain the complete mark sheet logic
        generateMarkSheet();
    }

    // Local method: handles all logic for mark sheet
    private static void generateMarkSheet() {
        Scanner sc = new Scanner(System.in);

        // Input student information
        System.out.print("Enter Student Name: ");
        String name = sc.next();

        System.out.print("Enter Roll Number of student: ");
        int roll = sc.nextInt();

        // Input marks of three subjects
        System.out.print("Enter Maths Marks: ");
        int maths = sc.nextInt();

        System.out.print("Enter English Marks: ");
        int english = sc.nextInt();

        System.out.print("Enter Science Marks: ");
        int science = sc.nextInt();

        //  marks (should be between 0 to 100)
        if ((maths < 0 || maths > 100) || (english < 0 || english > 100) || (science < 0 || science > 100)) {
            System.out.println("Invalid Input! Marks should be between 0 to 100.");
        } else {
            // Calculate total and percentage
            int total = maths + english + science;
            double percentage = total / 3.0;

            // Determine result (Pass/Fail)
            String result = (percentage >= 35) ? "Pass" : "Fail";

            // Determine grade based on percentage
            String grade;
            if (percentage >= 80) {
                grade = "A+";
            } else if (percentage >= 60) {
                grade = "A";
            } else if (percentage >= 50) {
                grade = "B";
            } else if (percentage >= 35) {
                grade = "C";
            } else {
                grade = "Fail";
            }

            // Print formatted Mark Sheet
            System.out.println(" _______________________________ ");
            System.out.println("|                               |");
            System.out.println("|          Mark Sheet           |");
            System.out.println("|_______________________________|");
            System.out.println("| Name      : " + name);
            System.out.println("| Roll No   : " + roll);
            System.out.println("|_______________________________|");
            System.out.println("| Subjects  :     Marks         |");
            System.out.println("|_______________________________|");
            System.out.println("| Maths     :     " + maths);
            System.out.println("| Science   :     " + science);
            System.out.println("| English   :     " + english);
            System.out.println("|_______________________________|");
            System.out.println("| Total     :     " + total);
            System.out.println("|_______________________________|");
            System.out.println("| Percentage:     " + percentage);
            System.out.println("| Result    :     " + result);
            System.out.println("| Grade     :     " + grade);
            System.out.println("|_______________________________|");
        }

        // Close the scanner to free resources
        sc.close();
    }
}

