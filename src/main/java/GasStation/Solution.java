package GasStation;

public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int r = -1;
        int tank = 0;
        int i = 0, j = 0;
        int count = 0;
        while( i < gas.length ) {
            count++;
            if(j == gas.length) {
                r = i;
                break;
            } else if (count > 2*gas.length) {
                return -1;
            }
            tank += gas[i];
            if(tank < cost[i]) {
                tank = 0;
                j = 0;
            } else {
                tank -= cost[i];
                j++;
            }
            if(i == gas.length-1) {
                i = 0;
                continue;
            }
            i++;
        }
        return r;
    }
}
