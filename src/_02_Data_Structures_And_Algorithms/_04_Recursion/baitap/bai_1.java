package _02_Data_Structures_And_Algorithms._04_Recursion.baitap;

public class bai_1 {
    public static void arrayToString(int[] nums, int i) {
        if (nums.length == 0) {
            System.out.println("Array is empty!!!");
            return;
        }
        if (i > 0) {
            arrayToString(nums, i - 1);
        }
        System.out.printf(nums[i] + " ");
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        arrayToString(nums, nums.length - 1);
    }
}
