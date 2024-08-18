package _02_Data_Structures_And_Algorithms._01_Array.baitap;

public class bai_8 {
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int k = removeElement(nums, val);
        System.out.print("The values of array is: ");
        for (int i = 0; i < k; i++) {
            System.out.printf("%d ", nums[i]);
        }
    }

    public static int removeElement(int[] nums, int val) {
        int k = nums.length;
        for (int i = 0; i < k; i++) {
            while (nums[i] == val && i < k) {
                for (int j = i; j < k - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                k--;
            }
        }
        return k;
    }
}
