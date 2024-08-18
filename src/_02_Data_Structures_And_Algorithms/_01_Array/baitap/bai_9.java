package _02_Data_Structures_And_Algorithms._01_Array.baitap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class bai_9 {
    public static void main(String[] args) {
//        int[] nums = {4,3,2,7,8,2,3,1};
        int[] nums = {1, 1, 4, 2};

        //Cách 1 =>
        List<Integer> list = findDisappearedNumbers(nums);

        //Cách 2 =>
//      List<Integer> list = findDisappearedNumbers1(nums);
        System.out.println(Arrays.toString(list.toArray()));
    }

        public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();

        // Tạo một mảng boolean với kích thước bằng với mảng nums
        // Mảng này sẽ được sử dụng để đánh dấu những số nào đã xuất hiện trong mảng nums
        boolean[] exist = new boolean[nums.length];
        // System.out.println(Arrays.toString(exist)); => [false,false,false,false]

        for (int num : nums) {
            // Trừ đi 1 để phù hợp với chỉ số mảng (bắt đầu từ 0)
            exist[num - 1] = true;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!exist[i]) {
                // Thêm số bị mất vào danh sách kết quả
                result.add(i + 1);
            }
        }
        return result;
    }

    public static List<Integer> findDisappearedNumbers1(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int num : nums) {
            int index = Math.abs(num) - 1;
            nums[index] = Math.abs(nums[index]) * -1;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }
        return result;
    }
}
