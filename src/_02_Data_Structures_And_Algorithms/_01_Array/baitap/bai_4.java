package _02_Data_Structures_And_Algorithms._01_Array.baitap;

import java.util.Scanner;

public class bai_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = nhapSoNguyenTrongKhoang(scanner, 5, 10, 'N');
        int[] arr = new int[n + 1];
        nhapMang(arr, scanner, n);
        xuatMang(arr, n);

        System.out.println("Số chẵn nhỏ nhất trong mảng: " + timSoChanNhoNhat(arr, n));

        System.out.println("Nhập số nguyên dương Q: ");
        int q = enterInteger(scanner);
        int o = nhapSoNguyenTrongKhoang(scanner, 0, n - 1, 'O');
        capNhatPhanTu(arr, q, o);
        xuatMang(arr, n);

        System.out.println("Nhập số nguyên dương K: ");
        int k = enterInteger(scanner);
        int x = nhapSoNguyenTrongKhoang(scanner, 0, n, 'X');
        themPhanTu(arr, k, x, n);
        n++;
        xuatMang(arr, n);

        System.out.println("Nhập số nguyên M (0 < M < N): ");
        int m = nhapSoNguyenTrongKhoang(scanner, 1, n - 1, 'M');
        xoaPhanTu(arr, m);
        n = n - m;
        xuatMang(arr, n);
    }

    private static int nhapSoNguyenTrongKhoang(Scanner scanner, int min, int max, char c) {
        System.out.printf("Nhập số nguyên dương %c: \n", c);
        String input = scanner.nextLine();
        while (true) {
            if (isInteger(input)) {
                int n = Integer.parseInt(input);
                if (n >= min && n <= max) {
                    return n;
                }
            }
            System.out.println("Nhap lai");
            input = scanner.nextLine();
        }
    }

    private static void xoaPhanTu(int[] arr, int m) {
        System.out.println("Xóa " + m + " phần tử đầu tiên");
        for (int i = 0; i < arr.length - m; i++) {
            arr[i] = arr[i + m];
        }
    }

    private static void themPhanTu(int[] arr, int k, int x, int n) {
        System.out.println("Thêm phần tử " + k + " vào vị trí " + x);
        for (int i = n; i > x; i--) {
            arr[i] = arr[i - 1];
        }
        arr[x] = k;
        n++;
    }

    private static void capNhatPhanTu(int[] arr, int q, int o) {
        System.out.println("Cập nhật phần tử " + o + " thành " + q);
        arr[o] = q;
    }

    private static String timSoChanNhoNhat(int[] arr, int n) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0 && arr[i] < min) {
                min = arr[i];
            }
        }
        return min == Integer.MAX_VALUE ? "0" : String.valueOf(min);
    }

    private static void nhapMang(int[] arr, Scanner scanner, int n) {
        System.out.println("Nhập các giá trị của mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            arr[i] = enterInteger(scanner);
        }
    }

    private static void xuatMang(int[] arr, int n) {
        System.out.println("Các phần tử của mảng: ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static boolean isInteger(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        int start = (str.charAt(0) == '-') ? 1 : 0;
        for (int i = start; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }

    private static int enterInteger(Scanner sc) {
        String input = sc.nextLine();
        while (true) {
            if (isInteger(input)) {
                return Integer.parseInt(input);
            } else {
                System.out.println("Vui lòng nhập số nguyên: ");
                input = sc.nextLine();
            }
        }
    }
}
