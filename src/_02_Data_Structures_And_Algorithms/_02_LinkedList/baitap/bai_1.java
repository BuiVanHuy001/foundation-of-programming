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
        if (head != null) {
            ListNode tmpo = head;
            ListNode preNode = head;
            int count = 1;
            while(tmpo != null) {
                tmpo = tmpo.next;
                count++;
                if (count > n) {
                    preNode = preNode.next;
                }
            }
            if (preNode == null) {
                return tmpo;
            } else {
                ListNode delNode = preNode.next;
                preNode.next = delNode.next;
                return head;
            }
        }
        return null;
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

        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
//        Input: 1->2->3->4->5->null
        head = removeNthFromEnd(head, 2);
        printLinkedList(head);
        //Expected: 1->2->3->5->null
    }
}
