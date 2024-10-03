package _03_Object_Oriented_Programming._02_OOP_Principles;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<FullTimeEmployee> fullTimeEmployeeList = new ArrayList<>();
    public static List<PartTimeEmployee> partTimeEmployeeList = new ArrayList<>();
    public static List<ContractEmployee> contractEmployeeList = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        FullTimeEmployee ft1 = null;
        try {
//            fullTimeEmployeeList.add(new FullTimeEmployee("Bui Van Huy", "ft1", -1, 5000));
            fullTimeEmployeeList.add(new FullTimeEmployee("Lam Quoc Dat", "ft2", 31, 7000));
            fullTimeEmployeeList.add(new FullTimeEmployee("Nguyen Van Tuan", "ft3", 28, 9000));
            fullTimeEmployeeList.add(new FullTimeEmployee("Vu Minh Quan", "ft4", 53, 10000));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        PartTimeEmployee pt1 = new PartTimeEmployee("Nguyen Huy", "pt1", 31, 25, 18);
        PartTimeEmployee pt2 = new PartTimeEmployee("Lam Mai", "pt2", 31, 25, 18);
        PartTimeEmployee pt3 = new PartTimeEmployee("Bui Hung Huy", "pt3", 31, 25, 18);
        PartTimeEmployee pt4 = new PartTimeEmployee("Nguyen Thi Tham", "pt4", 31, 25, 18);
        PartTimeEmployee pt5 = new PartTimeEmployee("Hoai Huong", "pt5", 31, 25, 18);
        PartTimeEmployee pt6 = new PartTimeEmployee("Thanh Long", "pt6", 31, 25, 18);

        ContractEmployee ct1 = new ContractEmployee("Hung Hung", "ct1", 52, 20000);
        for (FullTimeEmployee employee : fullTimeEmployeeList) {
            employee.printBasicDetails();

        }

    }
}
