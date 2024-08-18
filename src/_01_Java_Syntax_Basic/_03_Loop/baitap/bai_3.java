package _01_Java_Syntax_Basic._03_Loop.baitap;

import java.util.Scanner;

public class bai_3 {
    public static void main(String[] args) {
        //Nhập số nɡuyên dươnɡ n. Kiểm trɑ xem n có phải là số hoàn thiện hɑy khônɡ
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương n: ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        if (sum == n) {
            System.out.printf("%d là số hoàn thiện.%n", n);
        } else {
            System.out.printf("%d không phải là số hoàn thiện.%n", n);
        }
    }
}
