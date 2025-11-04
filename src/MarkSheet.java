import java.util.Scanner;

public class MarkSheet {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //students information

        System.out.print("Enter Student Name");
        String name = sc.next();

        System.out.println("Enter Roll Number of student");
        int Roll = sc.nextInt();
        // INput marks of three subjects
        System.out.println("Enter Marks Maths");
        int Maths = sc.nextInt();

        System.out.println("Enter English Marks");
        int English = sc.nextInt();

        System.out.println("Enter Science Marks");
        int science  = sc.nextInt();
        // Validate marks
        if ((Maths < 0 || Maths > 100) || (English < 0 || English > 100) || (science< 0 || science > 100)) {
            System.out.println("Invalid Input, Marks should be between 0 to 100");
        } else {
            // Calculate total and percentage
            int total =  Maths +  science + English;
            double percentage = total / 3.0;

            // Determine result
            String result = (percentage >= 35) ? "Pass" : "Fail";

            // Determine grade
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
            System.out.println("| Roll No   : " + Roll);
            System.out.println("|_______________________________|");
            System.out.println("| Subjects  :     Marks         |");
            System.out.println("|_______________________________|");
            System.out.println("| Math      :     " + Maths);
            System.out.println("| Science   :     " + science);
            System.out.println("| English   :     " + English);
            System.out.println("|_______________________________|");
            System.out.println("| Total     :     " + total);
            System.out.println("|_______________________________|");
            System.out.println("| Percentage:     " + percentage);
            System.out.println("| Result    :     " + result);
            System.out.println("| Grade     :     " + grade);
            System.out.println("|_______________________________|");
        }

        sc.close();
    }


    }

