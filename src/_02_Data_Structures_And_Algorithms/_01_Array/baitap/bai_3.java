package _02_Data_Structures_And_Algorithms._01_Array.baitap;

import java.util.Scanner;

public class bai_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập ngày: ");
        int day = scanner.nextInt();
        System.out.print("Nhập tháng: ");
        int month = scanner.nextInt();
        System.out.print("Nhập năm: ");
        int year = scanner.nextInt();
        if (isDateValid(day, month, year)) {
            System.out.println("Ngày tháng năm hợp lệ");
            System.out.println("Tháng " + month + " có " + getDaysInMonth(month, year) + " ngày");
            System.out.println("Ngày thứ " + dayOfYear(day, month, year) + " trong năm");
            System.out.println("Ngày tháng vừa nhập trong năm 2023 là thứ " + dayOfWeek(day, month, year) + " (Chủ Nhật là 0)");
        } else {
            System.out.println("Ngày tháng năm không hợp lệ");
        }
    }

    private static String dayOfWeek(int day, int month, int year) {
        int days = day;
        for (int i = 1; i < month; i++) {
            days += getDaysInMonth(i, year);
        }
        int dayOfWeek = (days + 1) % 7;
        return String.valueOf(dayOfWeek);
    }

    private static String dayOfYear(int day, int month, int year) {
        int days = day;
        for (int i = 1; i < month; i++) {
            days += getDaysInMonth(i, year);
        }
        return String.valueOf(days);
    }

    private static boolean isDateValid(int day, int month, int year) {
        return year >= 0 && month >= 1 && month <= 12 && day >= 1 && day <= getDaysInMonth(month, year);
    }

    private static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12) {
            return 0;
        }
        return switch (month) {
            case 4, 6, 9, 11 -> 30;
            case 2 -> isLeapYear(year) ? 29 : 28;
            default -> 31;
        };
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}
