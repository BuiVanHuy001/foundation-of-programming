package _01_Java_Syntax_Basic._02_Conditional_Statements.baitap;
import java.util.Scanner;

public class bai_4 {
    public static void main(String[] args) {
        //Nhập vào 3 số nguyên dương. Kiểm tra xem 3 số đó có phải là 3 cạnh của một tam giác không. Nếu có, kiểm tra xem tam giác đó là tam giác gì (vuông, cân, đều, thường). Tính chu vi và diện tích của tam giác đó.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất: ");
        int a = scanner.nextInt();
        System.out.print("Nhập số thứ hai: ");
        int b = scanner.nextInt();
        System.out.print("Nhập số thứ ba: ");
        int c = scanner.nextInt();
        if ((a + b > c && Math.abs(a - b) < c)) {
            if (a == b && b == c) {
                System.out.println("Đây là tam giác đều.");
            } else if (a == b || b == c || a == c) {
                System.out.println("Đây là tam giác cân.");
            } else if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
                System.out.println("Đây là tam giác vuông.");
            } else {
                System.out.println("Đây là tam giác thường.");
            }
            int perimeter = a + b + c;
            double p = perimeter / 2.0;
            double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.printf("Chu vi: %d%n", perimeter);
            System.out.printf("Diện tích: %.2f%n", area);
        } else {
            System.out.println("Ba số trên không phải là 3 cạnh của một tam giác.");
        }
    }
}