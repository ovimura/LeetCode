package MinimumCostToMoveChipsToTheSamePosition;

import java.util.*;

public class Solution {
    public int minCostToMoveChips(int[] position) {
        int cost = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int j=0; j<position.length; j++) {
            if(!map.keySet().contains(position[j])) {
                map.put(position[j], 1);
            } else {
                map.put(position[j], map.get(position[j])+1);
            }
        }
        List<Integer> costs = new ArrayList<>();
        for(int i=0; i<position.length; i++) {
            int max = position[i];
            for (Integer k : map.keySet()) {
                int tmp = max - k;
                if (tmp < 0)
                    tmp = -1 * tmp;
                int m = tmp % 2;
                m *= map.get(k);
                cost += m;
            }
            costs.add(cost);
            cost = 0;
        }
        int min = Integer.MAX_VALUE;
        for(int m=0; m<costs.size(); m++) {
            if(costs.get(m)<min)
                min = costs.get(m);
        }
        return min;
    }
}
