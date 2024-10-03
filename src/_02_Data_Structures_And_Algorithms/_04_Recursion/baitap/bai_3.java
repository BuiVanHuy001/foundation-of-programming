package _02_Data_Structures_And_Algorithms._04_Recursion.baitap;

import java.util.Arrays;

public class bai_3 {
    public static void reverseString(char[] s) {
        reverseString(s, 0);
    }

    public static void reverseString(char[] s, int i) {
        int length = s.length;
        if (i < length / 2) {
            char tmp = s[i];
            s[i] = s[length - i - 1];
            s[length - i - 1] = tmp;
            reverseString(s, ++i);
        }
    }

    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l'};
        reverseString(s);
        System.out.println(Arrays.toString(s));
    }
}
