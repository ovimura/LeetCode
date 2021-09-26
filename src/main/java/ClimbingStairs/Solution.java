package ClimbingStairs;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    private Map<Integer, Integer> memo = new HashMap<>();

    public int climbStairs(int b) {
        return helper(b);
    }

    public int helper(int n) {
        int r = 0;
        if(memo.containsKey(n)) return memo.get(n);
        if(n == 1) return 1;
        if(n == 2) return 2;
        r = (helper(n-1) + helper(n-2));
        memo.put(n, r);
        return r;
    }

    public int climbStairsBottomUp(int n) {
        int pre = 1;
        int curr = 1;
        int temp = 0;
        for(int i=1; i<n; i++) {
            temp = curr;
            curr = curr + pre;
            pre = temp;
        }
        return curr;
    }
}
