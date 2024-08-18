package _02_Data_Structures_And_Algorithms._02_LinkedList;

public class DemoSinglyLinkedList {
    public static class Node {
        int value;
        Node next; //Pointer to next Node

        //Constructor to create a new Node
        Node(int value) {
            this.value = value;
        }
    }

    public static void printLinkedList(Node head) {
        if (head == null) {
            System.out.println("List is empty!");
        } else {
            Node tmp = head;
            while (tmp != null) {
                System.out.print(tmp.value);
                System.out.print("->");
                tmp = tmp.next;
            }
            System.out.print("null\n");
        }
    }

    public static Node addFist(Node head, int value) {
        Node newNode = new Node(value);
        if (!(head == null)) {
            newNode.next = head;
        }
        return newNode;
    }

    public static Node addLast(Node head, int value) {
        Node newNode = new Node(value);
        if (head == null) {
            return newNode;
        } else {
    
            Node lastNode = head;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }
        return head;
    }

    public static Node addByIndex(Node head, int value, int index) {
        if (index == 0) {
            return addFist(head, value);
        } else {
            Node newNode = new Node(value);
            //Find position
            Node curNode = head;
            int count = 0;
            while (curNode != null) {
                count++;
                if (count == index) {
                    newNode.next = curNode.next;
                    curNode.next = newNode;
                    break;
                }
                curNode = curNode.next;
            }
            return head;
        }
    }

    public static Node removeFist(Node head) {
        if (head != null) {
            head = head.next;
        }
        return head;
    }

    public static Node removeLast(Node head) {
        if (head == null) {
            return null;
        }
        Node last = head;
        Node prev = null;
        while (last.next != null) {
            prev = last;
            last = last.next;
        }
        if (prev == null) {
            return null;
        } else {
            prev.next = null;
        }
        return head;
    }

    public static Node removeByIndex(Node head, int index) {
        if (head == null) {
            return null;
        }
        if (index == 0) {
            return removeFist(head);
        }
        Node cur = head;
        Node prev = null;
        int count = 0;
        while (cur != null) {
            if (count == index) {
                prev.next = cur.next;
                break;
            }
            prev = cur;
            cur = cur.next;
            count++;
        }
        return head;
    }
}
