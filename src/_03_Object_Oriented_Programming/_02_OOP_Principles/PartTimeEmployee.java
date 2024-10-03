package _03_Object_Oriented_Programming._02_OOP_Principles;

public class PartTimeEmployee extends BaseEmployee {
    private final double hourlyRate;
    private final int hourWorked;

    public PartTimeEmployee(String name, String employeeID, int age, double hourlyRate, int hourWorked) throws Exception {
        super(name, employeeID, age);
        this.hourlyRate = hourlyRate;
        this.hourWorked = hourWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hourWorked;
    }

    @Override
    public void printBasicDetails() {
        System.out.println("Part-time employee details");
        System.out.println("ID: " + getEmployeeID());
        System.out.println("Name: " + getName());
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Hour worked: " + hourWorked);
        System.out.println("Salary: " + calculateSalary());
        System.out.println();
    }
}
