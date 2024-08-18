package _01_Java_Syntax_Basic._04_Function.baitap;

import java.util.Scanner;

public class bai_4 {
    public static void main(String[] args) {
        //Nhập ngày, tháng, năm. Cho biết ngày vừa nhập là ngày thứ bao nhiêu trong năm. Lưu ý kiểm tra năm nhuận.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập ngày: ");
        int day = scanner.nextInt();
        System.out.print("Nhập tháng: ");
        int month = scanner.nextInt();
        System.out.print("Nhập năm: ");
        int year = scanner.nextInt();
        System.out.printf("Ngày %d/%d/%d là ngày thứ %s trong năm %d%n", day, month, year, dayOfYear(day, month, year), year);
    }

    private static String dayOfYear(int day, int month, int year) {
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
        if (isLeapYear(year)) {
            daysInMonth[2] = 29;
        }
        int dayOfYear = day;
        for (int i = 1; i < month; i++) {
            dayOfYear += daysInMonth[i];
        }
        return String.valueOf(dayOfYear);
    }

    private static boolean isLeapYear(int year) {
        return  year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }
}
