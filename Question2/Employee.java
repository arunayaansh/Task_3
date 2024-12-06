package Task3;

public class Employee implements Taxable{
    private int empId;
    private String name;
    private double salary;

    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void calcTax() {
        double tax = (incomeTax / 100) * salary;
        System.out.println("Income Tax for Employee " + name + ": " + tax);
    }
}
