package _02_Data_Structures_And_Algorithms._01_Array.baitap;

import java.util.Arrays;

public class bai_6 {
    public static void main(String[] args) {
        int[] nums1 = {4, 5, 6, 0, 0, 0};
        int[] nums2 = {1, 2, 9};
        int m = 3, n = 3;
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i : nums2) {
            insertElement(i, nums1, m);
            m++;
        }
    }

    private static void insertElement(int value, int[] nums1, int m) {
        boolean isChange = false;
        for (int j = 0; j < m; j++) {
            if (nums1[j] > value) {
                for (int i = m - 1; i >= j; i--) {
                    nums1[i + 1] = nums1[i];
                }
                nums1[j] = value;
                isChange = true;
                break;
            }
        }
        if (!isChange) {
            nums1[m] = value;
        }
    }
}
