package _02_Data_Structures_And_Algorithms._01_Array.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class bai_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N:");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        inputArray(scanner, nums);
        System.out.print("The values of array is: ");
        System.out.println(Arrays.toString(nums));
        System.out.println("Enter target");
        int target = scanner.nextInt();
        System.out.println(Arrays.toString(findSum(nums, target)));
    }

    public static int[] findSum(int[] arr, int target) {
        int[] result = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    public static void inputArray(Scanner scanner, int[] arr) {
        System.out.println("Enter values of array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Values %d: ", i + 1);
            arr[i] = scanner.nextInt();
        }
    }
}
