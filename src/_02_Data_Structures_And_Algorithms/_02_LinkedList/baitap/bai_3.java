package _02_Data_Structures_And_Algorithms._02_LinkedList.baitap;

public class bai_3 {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tmp = headA;
        while (tmp != null) {
            ListNode tmp2 = headB;
            while (tmp2 != null) {
                if (tmp2 == tmp) {
                    return tmp;
                }
                tmp2 = tmp2.next;
            }
            tmp = tmp.next;
        }
        return null;
    }

    public ListNode getIntersectionNode1(ListNode headA, ListNode headB) {
        int lenA = 0;
        ListNode tempA = headA;
        while (tempA != null) {
            tempA = tempA.next;
            lenA++;
        }
        int lenB = 0;
        ListNode tempB = headB;
        while (tempB != null) {
            tempB = tempB.next;
            lenB++;
        }
        tempA = headA;
        tempB = headB;
        if (lenA > lenB) {
            for (int i = 1; i <= lenA - lenB; i++) {
                tempA = tempA.next;
            }
        } else {
            for (int i = 1; i <= lenB - lenA; i++) {
                tempB = tempB.next;
            }
        }
        while (tempA != tempB) {
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return tempA;
    }


    public static void main(String[] args) {
        ListNode headA = new ListNode(4);
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(8);
        ListNode n3 = new ListNode(4);
        ListNode n4 = new ListNode(5);
        ListNode headB = new ListNode(5);
        ListNode n5 = new ListNode(6);
        ListNode n6 = new ListNode(1);

        headA.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        headB.next = n5;
        n5.next = n6;
        n6.next = n2;
        ListNode intersectionNode = getIntersectionNode(headA, headB);
        if (intersectionNode != null) {
            System.out.printf("Intersected at '%d'", intersectionNode.val);
        } else {
            System.out.println("No intersection");
        }
    }
}
