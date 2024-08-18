package _02_Data_Structures_And_Algorithms._01_Array.baitap;

import java.util.Scanner;

public class bai_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        nhapMang(arr, scanner);
        xuatMang(arr);
        System.out.println("Số lượng số nguyên tố có trong mảng: " + demSoNguyenTo(arr));
        System.out.println("Vị trí xuất hiện số chính phương đầu tiên: " + timSoChinhPhuong(arr));
        System.out.print("Nhập số nguyên K: ");
        int k = scanner.nextInt();
        System.out.println("Vị trí xuất hiện đầu tiên của số nguyên K: " + timViTriXuatHien(arr, k));
    }

    private static String timViTriXuatHien(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                return String.valueOf(i);
            }
        }
        return "-1";
    }

    private static int timSoChinhPhuong(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (isPerfectSquare(arr[i])) {
                return i;
            }
        }
        return -1;
    }

    private static boolean isPerfectSquare(int i) {
        return Math.sqrt(i) % 1 == 0;
    }

    private static String demSoNguyenTo(int[] arr) {
        int count = 0;
        for (int j : arr) {
            if (isPrimeNumber(j)) {
                count++;
            }
        }
        return String.valueOf(count);
    }

    private static boolean isPrimeNumber(int j) {
        if (j < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(j); i++) {
            if (j % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static void nhapMang(int[] arr, Scanner scanner) {
        System.out.println("Nhập các giá trị của mảng: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
    }

    private static void xuatMang(int[] arr) {
        System.out.println("Các phần tử của mảng: ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
