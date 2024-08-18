package _01_Java_Syntax_Basic._03_Loop.baitap;

import java.util.Scanner;

public class bai_6 {
    public static void main(String[] args) {
        //Nhập số nguyên dương n cho biết số đó có phải là số đối xứng hay không
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương n: ");
        int n = scanner.nextInt();
        int temp = n;
        int reverse = 0;
        while (temp > 0) {
            reverse = reverse * 10 + temp % 10;
            temp /= 10;
        }
        if (n == reverse) {
            System.out.println(n + " là số đối xứng");
        } else {
            System.out.println(n + " không phải là số đối xứng");
        }
    }
}
