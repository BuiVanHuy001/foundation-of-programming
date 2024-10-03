package _03_Object_Oriented_Programming._02_OOP_Principles;

public class Intern implements Employee {
    private String name;
    private String id;
    private double stipend;

    public Intern(String id, String name, double stipend) {
        setId(id);
        setName(name);
        setStipend(stipend);
    }

    private void setId(String id) {
        this.id = id;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setStipend(double stipend) {
        this.stipend = stipend;
    }

    @Override
    public double calculateSalary() {
        return stipend;
    }

    @Override
    public void printBasicDetails() {
        System.out.println("Intern Details");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Stipend: " + stipend);
    }
}
