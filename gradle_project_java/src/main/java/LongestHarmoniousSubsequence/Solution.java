package LongestHarmoniousSubsequence;

import java.util.*;

public class Solution {
    public int findLHS_slow(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        for(int i: nums) {
            if(count.containsKey(i)) {
                int val = count.get(i)+1;
                count.put(i, val);
            } else {
                count.put(i, 1);
            }
        }
        Set<Integer> keys = count.keySet();
        int lhs = 0;
        for (int n: keys) {
            for(int nn: keys) {
                if(Math.abs(n-nn) == 1) {
                    int temp = count.get(n)+count.get(nn);
                    if(lhs < (temp)) {
                        lhs = temp;
                    }
                }
            }
        }
        return lhs;
    }

    public int findLHS(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        for(int i: nums) {
            if(count.containsKey(i)) {
                int val = count.get(i)+1;
                count.put(i, val);
            } else {
                count.put(i, 1);
            }
        }
        List<Integer> keys = new ArrayList<Integer>(count.keySet());
        Collections.sort(keys);
        int i = 0, prev = 0, lhs = 0;
        for (Integer k:
             keys) {
            if(i==0)
                prev = k;
            else {
                if(Math.abs(prev-k) == 1) {
                    int temp = count.get(prev)+count.get(k);
                    if(lhs < temp) {
                        lhs = temp;
                    }
                }
                prev = k;
            }
            i++;
        }
        return lhs;
    }
}
