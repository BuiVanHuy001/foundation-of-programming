package _02_Data_Structures_And_Algorithms._02_LinkedList.baitap;

import java.util.List;

public class bai_2 {
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {
        }
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null)
            return false;

        ListNode slowPointer = head;
        ListNode fast = head.next;
        while (slowPointer != null) {
            if(fast != null) {
                for (int i = 0; i < 2; i++) {
                    if (fast != null) {
                        fast = fast.next;
                    }
                }
            }
            if (slowPointer == fast) {
                return true;
            }
            slowPointer = slowPointer.next;
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode();
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(0);
        ListNode n4 = new ListNode(-4);
        head.next = n2;
        n2.next = head;
        n3.next = n4;
        n4.next = n2;
        if (hasCycle(head)) {
            System.out.println("There is a cycle in Singly LinkedList");
        } else {
            System.out.println("There isn't a cycle in Singly LinkedList");
        }
    }
}
