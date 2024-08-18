package _01_Java_Syntax_Basic._04_Function.baitap;

import java.util.Scanner;

public class bai_1 {
    public static void main(String[] args) {
        //Nhập số nguyên n. Viết hàm countPrime() để đếm số lượng số nguyên tố từ 1 -> n.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên n: ");
        int n = scanner.nextInt();
        System.out.println("Số lượng số nguyên tố từ 1 -> " + n + " là: " + countPrime(n));
    }

    private static int countPrime(int n) {
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    private static boolean isPrime(int i) {
        if (i < 2) {
            return false;
        }
        for (int j = 2; j <= Math.sqrt(i); j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }
}
