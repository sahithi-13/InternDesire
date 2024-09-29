import java.util.*;

public class ElectricityBillManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] customerNames = {"John", "Jane", "Bob"};
        double[] customerBalances = {100.0, 200.0, 500.0};
        while (true) {
            System.out.println("Electricity Bill Management System");
            System.out.println("1. View Customer Information");
            System.out.println("2. Generate Bill");
            System.out.println("3. Make Payment");
            System.out.println("4. Exit");
            System.out.println("---------------------");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    viewCustomerInformation(customerNames, customerBalances);
                    break;
                case 2:
                    generateBill(customerNames, customerBalances, scanner);
                    break;
                case 3:
                    makePayment(customerNames, customerBalances, scanner);
                    break;
                case 4:
                    System.out.println("Thank you for using the Electricity Bill Management System!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    public static void viewCustomerInformation(String[] customerNames, double[] customerBalances) {
        for (int i = 0; i < customerNames.length; i++) {
            System.out.println("Customer Name: " + customerNames[i]);
            System.out.println("Balance: " + customerBalances[i]);
            System.out.println();
        }
    }
    public static void generateBill(String[] customerNames, double[] customerBalances, Scanner scanner) {
        System.out.print("Enter customer name: ");
        String name = scanner.next();
        int index = Arrays.asList(customerNames).indexOf(name);
        if (index != -1) {
            System.out.println("Bill for " + name);
            System.out.println("Balance: " + customerBalances[index]);
            System.out.println("Amount due: " + customerBalances[index]);
        } else {
            System.out.println("Customer not found!");
        }
    }
    public static void makePayment(String[] customerNames, double[] customerBalances, Scanner scanner) {
        System.out.print("Enter customer name: ");
        String name = scanner.next();
        int index = Arrays.asList(customerNames).indexOf(name);
        if (index != -1) {
            System.out.print("Enter payment amount: ");
            double amount = scanner.nextDouble();
            customerBalances[index] -= amount;
            System.out.println("Payment successful!");
        } else {
            System.out.println("Customer not found!");
        }
    }
}