package MostProfitAssigningWork;


import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int max_range = 100000;
        int[] max_profit = new int[max_range + 1];
        for (int i = 0; i < difficulty.length; ++i)
            max_profit[difficulty[i]] = Math.max(max_profit[difficulty[i]], profit[i]);
        for (int i = 2; i <= max_range; ++i)
            max_profit[i] = Math.max(max_profit[i], max_profit[i - 1]);
        int max = 0;
        for (int w : worker)
            max += max_profit[w];
        return max;
    }

    public int util(int[] difficulty, int[] profit, int[] worker) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<worker.length; i++) {
            int max = 0;
            for(int j=0; j<difficulty.length; j++) {
                if(worker[i]>=difficulty[j]) {
                    max = difficulty[j];
                }
            }
            list.add(max);
        }
        list.forEach(n -> {
            System.out.print(n + ", ");
        });
        return 0;
    }

}
