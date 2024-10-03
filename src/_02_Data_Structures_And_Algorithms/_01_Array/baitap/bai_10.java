package _02_Data_Structures_And_Algorithms._01_Array.baitap;

import java.util.Arrays;

public class bai_10 {
    public static int[] replaceElements(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int max = arr[i + 1];
            for (int j = i + 2; j < arr.length; j++) {
                if (max < arr[j]) {
                    max = arr[j];
                }
            }
            arr[i] = max;
        }
        arr[arr.length - 1] = -1;
        return arr;
    }
}