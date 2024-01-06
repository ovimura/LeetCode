package MaximumIceCreamBars;

import java.util.Arrays;

public class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int count = 0;
        int cum_costs = 0;
        for(int i=0; i<costs.length; i++) {
            if(cum_costs+costs[i] <= coins) {
                cum_costs += costs[i];
                count++;
            } else {
                break;
            }
        }
        return count;
    }
}
