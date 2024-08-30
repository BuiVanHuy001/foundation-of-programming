package _02_Data_Structures_And_Algorithms._03_Stack_And_Queue.baitap;

import java.util.LinkedList;
import java.util.Queue;

public class bai_2 {
    private static Queue<Integer> queue = new LinkedList<>();
    private static class RecentCounter {
        public RecentCounter() {
        }

        public int ping(int t) {
            queue.add(t);
            while(true) {
                int e = queue.peek();
                if (t - e > 3000) {
                    queue.remove();
                }else {
                    break;
                }
            }
            return queue.size();
        }
    }

    public static void main(String[] args) {
        RecentCounter recentCounter = new RecentCounter();
        System.out.println(recentCounter.ping(1));     // Output: 1
        System.out.println(recentCounter.ping(100));   // Output: 2
        System.out.println(recentCounter.ping(3001));  // Output: 3
        System.out.println(recentCounter.ping(3002));  // Output: 3
    }
}
