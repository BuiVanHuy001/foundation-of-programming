package _01_Java_Syntax_Basic._03_Loop.baitap;
import java.util.Scanner;

public class bai_1 {
    public static void main(String[] args) {
        //Nhập số nguyên dương n. Đếm số lượng ước số của n, và tính tổng các ước số đó.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương n: ");
        int n = scanner.nextInt();
        int count = 0;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
                sum += i;
            }
        }
        System.out.printf("Số lượng ước số của %d là %d.%n", n, count);
        System.out.printf("Tổng các ước số của %d là %d.%n", n, sum);
    }
}