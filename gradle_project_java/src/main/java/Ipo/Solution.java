package Ipo;

import java.util.PriorityQueue;

public class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        PriorityQueue<int[]> minHeapCapital = new PriorityQueue<>((a, b) -> (a[0] - b[0]));
        PriorityQueue<int[]> maxHeapProfits = new PriorityQueue<>((a, b) -> (b[1] - a[1]));

        for (int i = 0; i < profits.length; i++) {
            minHeapCapital.add(new int[] {capital[i], profits[i]});
        }

        for (int i = 0; i < k; i++) {
            while (!minHeapCapital.isEmpty() && minHeapCapital.peek()[0] <= w) {
                maxHeapProfits.add(minHeapCapital.remove());
            }

            if (maxHeapProfits.isEmpty()) {
                break;
            }

            w += maxHeapProfits.remove()[1];
        }
        return w;
    }
}
