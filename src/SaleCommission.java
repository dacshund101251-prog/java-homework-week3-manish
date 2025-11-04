import java.util.Scanner;

public class SaleCommission {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input details
        System.out.print("Enter Sales ID: ");
        int salesId = input.nextInt();


        System.out.print("Enter Seller's Name: ");
        String sellerName = input.nextLine();

        System.out.print("Enter Sales Amount: ");
        double salesAmount = input.nextDouble();

        System.out.print("Enter Basic Salary: ");
        double basicSalary = input.nextDouble();

        double commission = 0;

        // Calculate commission based on sales amount
        if (salesAmount >= 50000) {
            commission = salesAmount * 0.35;
        } else if (salesAmount >= 30000) {
            commission = salesAmount * 0.20;
        } else if (salesAmount >= 20000) {
            commission = salesAmount * 0.10;
        } else if (salesAmount >= 10000) {
            commission = salesAmount * 0.05;
        } else {
            commission = salesAmount * 0.02;
        }

        // Display results
        System.out.println("----- Sales Commission Report ---");
        System.out.println("Sales ID: " + salesId);
        System.out.println("Seller Name: " + sellerName);
        System.out.println("Sales Amount: " + salesAmount);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Commission: " + commission);

        input.close();
    }
}

