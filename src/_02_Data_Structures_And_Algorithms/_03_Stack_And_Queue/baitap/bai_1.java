package _02_Data_Structures_And_Algorithms._03_Stack_And_Queue.baitap;

import java.util.Stack;

public class bai_1 {
    public static boolean isValid(String s) {
        Stack<Character> myStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '{' || c == '(' || c == '[') {
                myStack.push(c);
            }else {
                if (myStack.isEmpty()) {
                    return false;
                }
                char peek = myStack.peek();
                if ((c == '}' && peek == '{') || (c == ')' && peek == '(') || (c == ']' && peek == '[')) {
                    myStack.pop();
                }else {
                    return false;
                }
            }
        }
        return myStack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "(])";
        if (isValid(s)) {
            System.out.println("This string is valid");
        } else {
            System.out.println("This string isn't valid");
        }
    }
}
