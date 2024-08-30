package _02_Data_Structures_And_Algorithms._03_Stack_And_Queue.baitap;

import java.util.Stack;

import static java.lang.Character.isDigit;

public class bai_6 {
    public static String decodeString(String s) {
        Stack<Character> characters = new Stack<>();
        for (int i = s.length() - 1; i > 2; i--) {
            char c = s.charAt(i);
            if (c == '[') {
                if (isDigit(s.charAt(i - 1))) {
                    Stack<Character> tmp = new Stack<>();
                    char encodeChar = s.charAt(i + 1);
                    while (encodeChar != ']') {
                        tmp.push(encodeChar);
                        encodeChar++;
                    }
                    int k = (int) s.charAt(i - 1);
                    for (int j = 1; j < k; j++) {
                        characters.push(tmp.pop());
                    }
                }
            }
        }
        return characters.toString();
    }

    public static void main(String[] args) {
        String s1 = "3[a]2[bc]"; //=> aaabcbc
        String s2 = "3[a2[c]]"; //=> accaccacc
        String s3 = "2[abc]3[cd]ef"; //=>abcabccdcdcdef
        System.out.println(decodeString(s1));
    }
}
