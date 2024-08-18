package _01_Java_Syntax_Basic._03_Loop.baitap;

import java.util.Scanner;

public class bai_4 {
    public static void main(String[] args) {
        //Nhập số nguyên dương a và b. Tìm bội chung nhỏ nhất và ước chung lớn nhất của chúng.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nguyên dương a: ");
        int a =  scanner.nextInt();
        System.out.println("Nhập số nguyên dương b: ");
        int b = scanner.nextInt();

        int gcd = a;
        while (a % gcd != 0 || b % gcd != 0) {
            gcd--;
        }
        int lcm = a;
        while (lcm % b != 0 || lcm % a != 0) {
            lcm++;
        }
        System.out.println("Ước chung lớn nhất của " + a + " và " + b + " là: " + gcd);
        System.out.println("Bội chung nhỏ nhất của " + a + " và " + b + " là: " + lcm);
    }
}
