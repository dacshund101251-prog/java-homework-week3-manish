import java.util.Scanner;

public class EmployeeSalarySlip {

    public static void main(String[] args) {
        // Call the method that handles all the logic
        generateSalarySlip();//calling local method
    }

    // Local method containing the logic for salary calculation and display
    public static void generateSalarySlip() {
        Scanner sc = new Scanner(System.in);

        // Input Employee Details
        System.out.print("Enter Employee Id: ");
        int empId = sc.nextInt();

        System.out.print("Enter Employee Name: ");
        String empName = sc.next();

        System.out.print("Enter Basic Salary: ");
        double basicSalary = sc.nextDouble();

        // Calculate Allowances and Deduction
        double hra = (basicSalary * 10) / 100; // 10%
        double ta = (basicSalary * 8) / 100;  // 8%
        double da = (basicSalary * 9) / 100;  // 9%
        double pf = (basicSalary * 20) / 100; // 20%

        // Final calculation
        double grossSalary = basicSalary + hra + ta + da - pf;

        // Salary Slip
        System.out.println(" _______________________________ ");
        System.out.println("|                               |");
        System.out.println("|         Salary Slip           |");
        System.out.println("|_______________________________|");
        System.out.println("| Employee ID     : " + empId);
        System.out.println("| Employee Name   : " + empName);
        System.out.println("|_______________________________|");
        System.out.println("| Basic Salary    : " + basicSalary);
        System.out.println("| HRA (10%)       : " + hra);
        System.out.println("| TA (8%)         : " + ta);
        System.out.println("| DA (9%)         : " + da);
        System.out.println("| PF (20%)        : " + pf);
        System.out.println("|_______________________________|");
        System.out.println("| Gross Salary    : " + grossSalary);
        System.out.println("|_______________________________|");

        sc.close();
    }
}