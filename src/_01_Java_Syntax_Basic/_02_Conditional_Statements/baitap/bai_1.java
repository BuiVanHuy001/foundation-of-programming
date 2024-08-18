package _01_Java_Syntax_Basic._02_Conditional_Statements.baitap;
import java.util.Scanner;

public class bai_1 {
    public static void main(String[] args) {
        //Nhập vào 3 số nguyên. Xuất ra màn hình số lớn nhất.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất: ");
        int a = scanner.nextInt();
        System.out.print("Nhập số thứ hai: ");
        int b = scanner.nextInt();
        System.out.print("Nhập số thứ ba: ");
        int c = scanner.nextInt();
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println("Số lớn nhất là: " + max);
    }
}
