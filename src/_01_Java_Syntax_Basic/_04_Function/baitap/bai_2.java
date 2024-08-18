package _01_Java_Syntax_Basic._04_Function.baitap;

import java.util.Scanner;

public class bai_2 {
    public static void main(String[] args) {
        //Nhập số nguyên dương n. Viết hàm factorial() nhận một số nguyên dương và trả về giai thừa của số đó.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương n: ");
        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println("Vui lòng nhập số nguyên dương.");
            return;
        }
        System.out.printf("Giai thừa của %d là: %d", n, factorial(n));
    }

    private static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
