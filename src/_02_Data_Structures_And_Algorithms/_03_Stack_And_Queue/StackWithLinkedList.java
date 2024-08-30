package _02_Data_Structures_And_Algorithms._03_Stack_And_Queue;

import java.util.ArrayList;
import java.util.Arrays;

public class StackWithLinkedList {
    private class Node {
        int value;
        Node next;
        Node(int val) {
            this.value = val;
        }
    }

    Node topNode;

    StackWithLinkedList() {
        topNode = null;
    }

    public boolean isEmpty() {
        return topNode == null;
    }

    public boolean isFull() {
        return false;
    }

    public boolean push(int val) {
        if (!isFull()) {
            Node newNode = new Node(val);
            newNode.next = topNode;
            topNode = newNode;
            return true;
        }
        return false;
    }

    public int pop() {
        if (!isEmpty()) {
            int val = topNode.value;
            topNode = topNode.next;
            return val;
        }
        return -1;
    }

    public void show() {
        if (isEmpty()) {
            System.out.println("List is empty!");
        }else {
            Node tmp = topNode;
            ArrayList<Integer> tmpList = new ArrayList<>();
            while(tmp != null) {
                tmpList.add(tmp.value);
                tmp = tmp.next;
            }
            System.out.print("The values of stack is: ");
            System.out.println(Arrays.toString(tmpList.reversed().toArray()));
        }
    }
}
