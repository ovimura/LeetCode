package MinimumRoundsToCompleteAllTasks;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int minimumRounds(int[] tasks) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int task : tasks) {
            if (!count.containsKey(task))
                count.put(task, 1);
            else {
                int v = count.get(task);
                count.put(task, v + 1);
            }
        }
        int rounds = 0;
        for(int k: count.keySet()) {
            int v = count.get(k);
            if(v == 1)
                return -1;
            if(v %3 != 0) {
                rounds += v / 3 + 1;
            } else {
                rounds += v / 3;
            }
        }
        return rounds;
    }
}
