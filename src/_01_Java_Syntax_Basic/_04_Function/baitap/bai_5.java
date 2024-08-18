package _01_Java_Syntax_Basic._04_Function.baitap;

import java.util.Scanner;

public class bai_5 {
    public static void main(String[] args) {
        //Nhập vào số tiền ban đầu, số năm.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số tiền ban đầu: ");
        double money = scanner.nextDouble();
        System.out.print("Nhập số năm: ");
        int years = scanner.nextInt();
        //Tính số tiền gốc sau số năm đã nhập.
        System.out.printf("Số tiền gốc sau %d năm là %.2f%n", years, calculateMoney(money, years));

        System.out.print("Nhập diện tích căn hộ (m2): ");
        int area = scanner.nextInt();
        int price = 15000000;
        int minYears = 0;
        //Tính số năm cần gửi tiết kiệm ít nhất để mua căn hộ.
        double withdrawMoney = 0;
        while (withdrawMoney < area * price) {
            minYears++;
            withdrawMoney = calculateMoney(money, minYears);
        }
        System.out.printf("Cần gửi tiết kiệm ít nhất %d năm để có thể mua căn hộ. Lúc đó số tiền gốc rút được là %.2f%n", minYears, withdrawMoney);
    }

    private static double calculateMoney(double money, int years) {
        //Thực hiện logic.
        double interestRate = 6.3 / 100;
        for (int i = 0; i < years; i++) {
            money += money * interestRate;
        }
        return money;
    }
}
