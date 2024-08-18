package _01_Java_Syntax_Basic._01_Variables_and_Data_Types.baitap;
import java.util.Scanner;

public class BaiTap {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để đọc dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Nhập thông tin từ người dùng
        System.out.print("Nhập họ: ");
        String lastName = scanner.nextLine();

        System.out.print("Nhập tên: ");
        String firstName = scanner.nextLine();

        System.out.print("Nhập giới tính (Nam/Nữ): ");
        String gender = scanner.nextLine();

        System.out.print("Nhập năm sinh: ");
        short birthYear = scanner.nextShort();

        System.out.print("Nhập chiều cao (cm): ");
        float heightCm = scanner.nextFloat();

        System.out.print("Nhập cân nặng (kg): ");
        float weightKg = scanner.nextFloat();

        short currentYear = 2024; // Bạn có thể cập nhật năm hiện tại theo thời gian thực
        short age = (short) (currentYear - birthYear);

        float heightFeet = (float) (heightCm / 30.48);
        float weightPound = (float) (weightKg * 2.20462);

        // Xuất thông tin ra màn hình theo format yêu cầu
        System.out.printf("Họ tên: %s %s%n", lastName, firstName);
        System.out.printf("Giới tính: %s%n", gender);
        System.out.printf("Tuổi: %d%n", age);
        System.out.printf("Chiều cao: %.2f feet%n", heightFeet);
        System.out.printf("Cân nặng: %.2f pounds%n", weightPound);

        scanner.close();
    }
}
