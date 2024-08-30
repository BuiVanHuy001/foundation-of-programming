package _02_Data_Structures_And_Algorithms._03_Stack_And_Queue.baitap;

import java.util.LinkedList;
import java.util.Queue;

public class bai_5 {
    static class MyStack {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        public MyStack() {

        }

        public void push(int x) {
            q1.add(x);
        }

        public int pop() {
            int val = 0;
            while (!q1.isEmpty()) {
                if (q1.size() == 1) {
                    val = q1.remove();
                } else {
                    q2.add(q1.remove());
                }
            }
            swap();
            return val;
        }

        public int top() {
            int val = 0;
            while (!q1.isEmpty()) {
                if (q1.size() == 1) {
                    val = q1.peek();
                }
                q2.add(q1.remove());
            }
            swap();
            return val;
        }

        public void swap() {
            Queue<Integer> tmp = q2;
            q2 = q1;
            q1 = tmp;
        }

        public boolean empty() {
            return q1.isEmpty();
        }
    }

//    public static void main(String[] args) {
//        MyStack myStack = new MyStack();
//
//        myStack.push(1);
//        myStack.push(2);
//        myStack.push(3);
//        System.out.println("Top is: " + myStack.top());
//        System.out.println("Pop is:" +  myStack.pop());
//        System.out.println("Pop is:" +  myStack.pop());
//        System.out.println("Top is: " + myStack.top());
//        System.out.println("Pop is:" +  myStack.pop());
//        System.out.println("Pop is:" +  myStack.pop());
//        System.out.println(myStack.empty());
//    }
}
