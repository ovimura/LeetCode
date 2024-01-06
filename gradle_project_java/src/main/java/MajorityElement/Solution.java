package MajorityElement;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int majorityElement(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>();
        Integer max = Integer.MIN_VALUE;
        Integer majElm = 0;
        for (int n:
             nums) {
            if(counts.get(n) != null) {
                int val = counts.get(n);
                val += 1;
                if(val > max) {
                    max = val;
                    majElm = n;
                }
                counts.put(n, val);
            } else {
                counts.put(n,1);
                if(1 > max) {
                    max = 1;
                    majElm = n;
                }
            }
        }
        return majElm;
    }
}
