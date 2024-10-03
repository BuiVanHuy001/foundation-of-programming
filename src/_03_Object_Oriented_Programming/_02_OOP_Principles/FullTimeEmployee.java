package _03_Object_Oriented_Programming._02_OOP_Principles;

public class FullTimeEmployee extends BaseEmployee {
    private final double monthlySalary;

    public FullTimeEmployee(String name, String employeeID, int age, double monthlySalary) throws Exception {
        super(name, employeeID, age);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }

    @Override
    public void printBasicDetails() {
        System.out.println("Full-time employee details");
        System.out.println("ID: " + getEmployeeID());
        System.out.println("Name: " + getName());
        System.out.println("Month salary: " + calculateSalary());
        System.out.println();
    }
}
