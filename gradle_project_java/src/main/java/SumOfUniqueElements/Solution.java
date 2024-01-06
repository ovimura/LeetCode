package SumOfUniqueElements;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int sumOfUnique(int[] nums) {
        int s = 0;
        Map<Integer, Integer> c = new HashMap<>();
        for(int n: nums) {
            if(!c.keySet().contains(n)) {
                c.put(n, 1);
            } else {
                int v = c.get(n);
                c.put(n, v+1);
            }
        }
        for(int k: c.keySet()) {
            if(c.get(k) == 1)
                s += k;
        }
        return s;
    }
}
