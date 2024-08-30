package _02_Data_Structures_And_Algorithms._03_Stack_And_Queue.baitap;

import java.util.Stack;

public class bai_4 {
    static class MyQueue {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        public MyQueue() {
        }

        public void push(int x) {
            s1.push(x);
        }

        public int pop() {
            pour();
            return s2.pop();
        }

        public int peek() {
            pour();
            return s2.peek();
        }

        public void pour() {
            if (s2.isEmpty()) {
                while (!s1.isEmpty()) {
                    s2.push(s1.pop());
                }
            }
        }

        public boolean empty() {
            return s1.isEmpty() && s2.empty();
        }
    }

    //For test uncomment this code bock below
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1); // queue là: [1]
        System.out.println(myQueue.pop()); // return 1, queue là [2]
        System.out.println(myQueue.empty()); // return false
    }
}
