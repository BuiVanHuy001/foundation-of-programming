package _01_Java_Syntax_Basic._05_String.baitap;

import java.util.Scanner;

public class bai_1 {
    public static int getLength(String str) {
        int length = 0;
        while (str.charAt(length) != '\0') {
            length++;
        }
        return length;
    }

    public static String toUpperCase(String str) {
        StringBuilder upperCaseStr = new StringBuilder();
        for (int i = 0; i < getLength(str); i++) {
            char ch = str.charAt(i);
            // Nếu ký tự là chữ cái thường, chuyển thành chữ hoa
            if (ch >= 'a' && ch <= 'z') {
                upperCaseStr.append((char) (ch - ('a' - 'A')));
            } else {
                upperCaseStr.append(ch);
            }
        }
        return upperCaseStr.toString();
    }

    public static String toLowerCase(String str) {
        StringBuilder lowerCaseStr = new StringBuilder();
        for (int i = 0; i < getLength(str); i++) {
            char ch = str.charAt(i);
            // Nếu ký tự là chữ hoa, chuyển thành chữ thường
            if (ch >= 'A' && ch <= 'Z') {
                lowerCaseStr.append((char) (ch + ('a' - 'A')));
            } else {
                lowerCaseStr.append(ch);
            }
        }
        return lowerCaseStr.toString();
    }

    // Hàm chuyển đổi chuỗi thành chuẩn (chỉ viết hoa chữ cái đầu mỗi từ)
    public static String toTitleCase(String str) {
        StringBuilder titleCase = new StringBuilder();
        boolean isNewWord = true; // Đánh dấu bắt đầu của từ mới

        for (int i = 0; i < getLength(str); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                titleCase.append(ch); // Thêm khoảng trắng
                isNewWord = true; // Đánh dấu là bắt đầu từ mới
            } else {
                if (isNewWord) {
                    // Viết hoa chữ cái đầu
                    if (ch >= 'a' && ch <= 'z') {
                        titleCase.append((char) (ch - ('a' - 'A')));
                    } else {
                        titleCase.append(ch);
                    }
                    isNewWord = false; // Đánh dấu không phải từ mới nữa
                } else {
                    // Viết thường các ký tự còn lại
                    if (ch >= 'A' && ch <= 'Z') {
                        titleCase.append((char) (ch + ('a' - 'A')));
                    } else {
                        titleCase.append(ch);
                    }
                }
            }
        }
        return titleCase.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một chuỗi ký tự: ");
        String input = scanner.nextLine();

        int length = getLength(input);
        System.out.println("Độ dài chuỗi: " + length);

        String upperCase = toUpperCase(input);
        System.out.println("Chuỗi viết hoa: " + upperCase);

        String lowerCase = toLowerCase(input);
        System.out.println("Chuỗi viết thường: " + lowerCase);

        String titleCase = toTitleCase(input);
        System.out.println("Chuỗi viết chuẩn: " + titleCase);
    }
}
