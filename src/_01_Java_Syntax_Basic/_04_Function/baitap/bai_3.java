package _01_Java_Syntax_Basic._04_Function.baitap;

import java.util.Scanner;

public class bai_3 {
    public static void main(String[] args) {
        //Nhập số nguyên dương n. Viết hàm sumDigits() nhận vào một số nguyên và trả về tổng của chữ số của số đó.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương n: ");
        int n = scanner.nextInt();
        System.out.println("Tổng các chữ số của " + n + " là: " + sumDigits(n));
    }

    private static String sumDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return String.valueOf(sum);
    }
}
