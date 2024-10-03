package _03_Object_Oriented_Programming._02_OOP_Principles;

public class ContractEmployee extends BaseEmployee {
    private double baseSalary;

    public ContractEmployee(String name, String employeeID, int age, double baseSalary) throws Exception {
        super(employeeID, name, age);
        this.baseSalary = baseSalary;
    }

    @Override
    public double calculateSalary() {
        return baseSalary;
    }

    @Override
    public void printBasicDetails() {
        System.out.println("Contract employee details");
        System.out.println("ID: " + getEmployeeID());
        System.out.println("Name: " + getName());
        System.out.println("Base salary: " + calculateSalary());
        System.out.println();
    }
}
