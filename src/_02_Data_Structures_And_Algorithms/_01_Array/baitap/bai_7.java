package _02_Data_Structures_And_Algorithms._01_Array.baitap;

public class bai_7 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 3, 4, 1, 5, 1, 1};
        int k = removeDuplicates(nums);
        System.out.print("Array after remove duplicate value is: ");
        for (int i = 0; i < k; i++) {
            System.out.printf("%d ", nums[i]);
        }
    }

    private static int removeDuplicates(int[] nums) {
        int k = nums.length;
        for (int i = 0; i < k; i++) {
            for (int j = i + 1; j < k; j++) {
                while (nums[i] == nums[j] && j < k) {
                    removeElement(nums, j, k);
                    k--;
                }
            }
        }
        return k;
    }

    private static void removeElement(int[] nums, int index, int size) {
        for (int i = index; i < size - 1; i++) {
            nums[i] = nums[i + 1];
        }
    }
}
