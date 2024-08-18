package _01_Java_Syntax_Basic._03_Loop.baitap;

import java.util.Scanner;

public class bai_5 {
    public static void main(String[] args) {
        //Nhập số nguyên dương n tính tổng các chữ số của số đó
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nguyên dương n: ");
        int n = scanner.nextInt();
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println("Tổng các chữ số của số vừa nhập là: " + sum);
    }
}
