package Task3;

import java.util.Scanner;

public class DriverMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Employee Details:");
        System.out.print("Employee ID: ");
        int empId = scanner.nextInt();
        System.out.print("Employee Name: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.print("Employee Salary: ");
        double salary = scanner.nextDouble();

        Employee employee = new Employee(empId, name, salary);
        employee.calcTax();

        System.out.println("\nEnter Product Details:");
        System.out.print("Product ID: ");
        int pid = scanner.nextInt();
        System.out.print("Product Price: ");
        double price = scanner.nextDouble();
        System.out.print("Product Quantity: ");
        int quantity = scanner.nextInt();

        Product product = new Product(pid, price, quantity);
        product.calcTax();

        scanner.close();
    }
}



/* output:
Enter Employee Details:
Employee ID: 1
Employee Name: Arun
Employee Salary: 30000
Income Tax for Employee Arun: 3150.0

Enter Product Details:
Product ID: 1
Product Price: 1000
Product Quantity: 1
Sales Tax for Product ID 1: 70.0

Process finished with exit code 0 */
