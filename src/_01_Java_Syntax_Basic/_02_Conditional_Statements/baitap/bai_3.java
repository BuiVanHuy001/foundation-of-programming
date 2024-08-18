package _01_Java_Syntax_Basic._02_Conditional_Statements.baitap;
import java.util.Scanner;

public  class bai_3 {
    public static void main(String[] args) {
        //Nhập vào tháng và năm. Cho biết tháng đó có bao nhiêu ngày.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tháng: ");
        int month = scanner.nextInt();
        System.out.print("Nhập năm: ");
        int year = scanner.nextInt();
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: System.out.println("Tháng " + month + " năm " + year + " có 31 ngày."); break;
            case 4:
            case 6:
            case 9:
            case 11: System.out.println("Tháng " + month + " năm " + year + " có 30 ngày."); break;
            case 2:
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
                    System.out.println("Tháng " + month + " năm " + year + " có 29 ngày.");
                } else {
                    System.out.println("Tháng " + month + " năm " + year + " có 28 ngày.");
                }
                break;
            default: System.out.println("Tháng không hợp lệ.");
        }
    }
}