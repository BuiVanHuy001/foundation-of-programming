package _02_Data_Structures_And_Algorithms._02_LinkedList.baitap;

public class bai_1 {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 1;
        ListNode tmp = head;
        ListNode prev = null;
        while (tmp != null) {
            if (count == n + 1) {
                prev = head;
            }
            if (count > n + 1) {
                prev = prev.next;
            }
            tmp = tmp.next;
            count++;
        }
        if (prev != null) {
            ListNode delNode = prev.next;
            System.out.println(delNode.val);
            prev.next = delNode.next;
        } else {
            return head.next;
        }
        return head;
    }

    public static void printLinkedList(ListNode head) {
        if (head == null) {
            System.out.println("List is empty!");
        } else {
            ListNode tmp = head;
            while (tmp != null) {
                System.out.print(tmp.val);
                System.out.print("->");
                tmp = tmp.next;
            }
            System.out.print("null\n");
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);

//        head.next = n2;
//        n2.next = n3;
//        n3.next = n4;
//        n4.next = n5;
        printLinkedList(head);
//        Input: 1->2->3->4->5->null
        head = removeNthFromEnd(head, 1);
        printLinkedList(head);
        //Expected: 1->2->3->5->null
    }
}
