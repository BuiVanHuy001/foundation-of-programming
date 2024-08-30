package _02_Data_Structures_And_Algorithms._03_Stack_And_Queue;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack elements: " + stack);

        int topElement = stack.peek();
        System.out.println("Top element: " + topElement);

        int poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);

        System.out.println("Stack after pop: " + stack);

        boolean isEmpty = stack.isEmpty();
        System.out.println("Is stack empty? " + isEmpty);

        int position = stack.search(20);
        System.out.println("Position of 20: " + position);
    }
}