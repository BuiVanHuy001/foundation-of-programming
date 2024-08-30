package _02_Data_Structures_And_Algorithms._03_Stack_And_Queue.baitap;

import java.util.Stack;

public class bai_3 {
    static class MinStack {
        static Stack<Integer> stack = new Stack<>();
        static int min = Integer.MAX_VALUE;

        public MinStack() {

        }

        public void push(int val) {
            if (val < min) {
                min = val;
            }
            stack.push(val);
        }

        public void pop() {
            int val = stack.pop();
            if (val == min) {
                min = Integer.MAX_VALUE;
                for (Integer integer : stack) {
                    if (min > integer) {
                        min = integer;
                    }
                }
            }
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return min;
        }
    }
}
