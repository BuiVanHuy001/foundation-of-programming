package _03_Object_Oriented_Programming._02_OOP_Principles;

// Abstract class thực hiện Encapsulation các attribute chung
abstract class BaseEmployee implements Employee {

    private String name;
    private int age;
    private String employeeID;
    private String department;

    public BaseEmployee(String name, String employeeID, int age) throws Exception {
        setEmployeeID(employeeID);
        setAge(age);
        setName(name);
    }


    public String getName() {
        return name;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Employee must be over 18 years old");
        }
        this.age = age;
    }

    public void setEmployeeID(String id) {

        employeeID = id;
    }

    public abstract double calculateSalary();

    public abstract void printBasicDetails();
}
