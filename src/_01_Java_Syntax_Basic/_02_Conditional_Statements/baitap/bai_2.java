package _01_Java_Syntax_Basic._02_Conditional_Statements.baitap;
import java.util.Scanner;

public class bai_2 {
    public static void main(String[] args) {
        //Nhập lương nhân viên, tính thuế thu nhập cá nhân và số tiền lương thực sự mà nhân viên đó nhận được
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập lương nhân viên: ");
        double salary = scanner.nextDouble();
        double tax = 0;
        if (salary > 15000000) {
            tax = salary * 0.3;
        } else if (salary >= 7000000) {
            tax = salary * 0.2;
        } else {
            tax = salary * 0.1;
        }
        double realSalary = salary - tax;
        System.out.printf("Thuế thu nhập cá nhân: %.2f%n" , tax);
        System.out.printf("Lương thực sự nhận được: %.2f%n", realSalary);
    }
}