package _02_Data_Structures_And_Algorithms._03_Stack_And_Queue;

import java.util.ArrayList;
import java.util.Arrays;

public class QueueWithLinkedList {
    private class Node {
        int value;
        Node next;
        Node(int val) {
            this.value = val;
        }
    }

    Node topNode;
    Node tailNode;

    QueueWithLinkedList() {
        topNode = null;
        tailNode = null;
    }

    public boolean isFull() {
        return false;
    }

    public boolean isEmpty() {
        return topNode == null;
    }

    public boolean enQueue(int val) {
        if (!isFull()) {
            Node newNode = new Node(val);
            if (tailNode == null) {
                tailNode = newNode;
                topNode = newNode;
            }else {
                tailNode.next = newNode;
                tailNode = newNode;
            }
            return true;
        }
        return false;
    }

    public int deQueue() {
        if(!isEmpty()) {
            int val = topNode.value;
            topNode = topNode.next;
            return val;
        }
        return -1;

    }

    public void show() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
        }else {
            Node tmp = topNode;
            System.out.print("The values of Queue is: ");
            while(tmp != null) {
                System.out.printf("%d ", tmp.value);
                tmp = tmp.next;
            }
            System.out.println();
        }
    }
}
