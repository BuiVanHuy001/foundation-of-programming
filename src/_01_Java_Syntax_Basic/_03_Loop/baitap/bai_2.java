package _01_Java_Syntax_Basic._03_Loop.baitap;

import java.util.Scanner;

public class bai_2 {
    public static void main(String[] args) {
        //Nhập số nguyên dương n. Cho biết n có phải số nguyên tố không.
        Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Nhập số nguyên dương n: ");
        int n = scanner.nextInt();
        if (n < 2) {
            System.out.printf("%d không phải số nguyên tố.%n", n);
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.printf("%d là số nguyên tố.%n", n);
            } else {
                System.out.printf("%d không phải số nguyên tố.%n", n);
            }
        }
    }
}
