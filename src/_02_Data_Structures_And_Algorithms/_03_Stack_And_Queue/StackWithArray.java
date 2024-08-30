package _02_Data_Structures_And_Algorithms._03_Stack_And_Queue;

public class StackWithArray {
    private int topIndex;
    private int[] array;
    private int SIZE;

    StackWithArray(int size) {
        SIZE = size;
        array = new int[SIZE];
        topIndex = -1;
    }

    public boolean push(int val) {
        if (!isFull()) {
            topIndex++;
            array[topIndex] = val;
            return true;
        }
        return false;
    }

    public boolean pop() {
        if (!isEmpty()) {
            topIndex--;
            return true;
        }
        return false;
    }

    public int peek() {
        if(!isFull()) {
            return array[topIndex];
        }
        return -1;
    }

    public boolean isEmpty() {
        return topIndex == -1;
    }

    public boolean isFull() {
        return topIndex == SIZE - 1;
    }

    public void show() {
        System.out.print("The value of Array is: ");
        for (int i = 0; i <= topIndex; i++) {
            System.out.printf("%d ", array[i]);
        }
    }
}