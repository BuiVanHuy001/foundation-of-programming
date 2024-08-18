package _02_Data_Structures_And_Algorithms._01_Array.baitap;

import java.util.Scanner;

public class bai_2 {
    public static void main(String[] args) {
        //Nhập vào số nguyên N. Cho người dùng nhập 1 mảng gồm có N phần tử kiểu số nguyên. Sắp xếp mảng này theo thứ tự tăng dần và giảm dần.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        nhapMang(arr, scanner);
        sapXepTangDan(arr);
        xuatMang(arr);
        sapXepGiamDan(arr);
        xuatMang(arr);
    }

    private static void sapXepGiamDan(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    private static void sapXepTangDan(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
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
