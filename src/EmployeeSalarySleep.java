import java.util.Scanner;

public class EmployeeSalarySleep {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Input Employee Details
        System.out.println("Enter Employee Id: ");
        int empId = sc.nextInt();

        System.out.println("Enter Employee Name :");
        String empName = sc.next();
        System.out.println("Enter Basic Salary:");
        double BasicSalary = sc.nextDouble();
        ;
        //Calculate Allowences and Deduction
        double hra = (BasicSalary * 10) / 100;//10%
        double ta = (BasicSalary * 8) / 100;//8%
        double da = (BasicSalary * 9) / 100;//9%
        double pf = (BasicSalary * 20) / 100;//20%
        //final calculation
        double grosssalary = BasicSalary + hra + ta + da - pf;

        //salary slip
        System.out.println(" _______________________________ ");
        System.out.println("|                               |");
        System.out.println("|         Salary Slip           |");
        System.out.println("|_______________________________|");
        System.out.println("| Name      : " + empId);
        System.out.println("| Employee Name  : " + empName);
        System.out.println("|_______________________________|");
        System.out.println("| Basic Salary :   " + BasicSalary);
        System.out.println("| Hra 10%  :     " + hra);
        System.out.println("| Ta 8%     :     " + ta);
        System.out.println("| Da 9%:     " + da);
        System.out.println("| Pf 20%    :     " + pf);
        System.out.println("|_______________________________|");
        System.out.println("| Gross Salary:      " + grosssalary);
        System.out.println("|_______________________________|");

sc.close();
    }

}
