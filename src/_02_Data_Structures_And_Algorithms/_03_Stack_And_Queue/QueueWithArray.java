package _02_Data_Structures_And_Algorithms._03_Stack_And_Queue;

public class QueueWithArray {
    private int[] array;
    private int SIZE;
    private int headIndex;
    private int tailIndex;

    QueueWithArray(int size) {
        SIZE = size;
        array = new int[SIZE];
        tailIndex = headIndex = -1;
    }

    public boolean isFull() {
        return tailIndex >= SIZE - 1;
    }

    public boolean isEmpty() {
        return tailIndex == -1;
    }

    public boolean enQueue(int value) {
        if (!isFull()) {
            if (isEmpty())
                headIndex++;
            tailIndex++;
            array[tailIndex] = value;
            return true;
        }
        return false;
    }

    public int deQueue() {
        if (!isEmpty()) {
            int val = array[headIndex];
            headIndex++;
            // Reset indices if queue is now empty
            if (headIndex > tailIndex) {
                headIndex = tailIndex = -1;
            }
            return val;
        }
        return -1;  // Or some other value/error indicator
    }

    public void show() {
        if (!isEmpty()) {
            System.out.print("The values of Array is: ");
            for (int i = headIndex; i <= tailIndex; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Queue is empty");
        }
    }

    public static void main(String[] args) {
        QueueWithArray myQueue = new QueueWithArray(4);
        myQueue.enQueue(1);
        myQueue.enQueue(2);
        myQueue.enQueue(3);
        myQueue.enQueue(4);
        myQueue.enQueue(5);
        myQueue.deQueue();
        myQueue.enQueue(6);
        myQueue.show();
    }
}
