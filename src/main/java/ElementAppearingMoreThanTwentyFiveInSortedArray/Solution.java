package ElementAppearingMoreThanTwentyFiveInSortedArray;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int findSpecialInteger(int[] arr) {
        Map<Integer, Integer> m = new HashMap<>();
        int moreThanTwentyFive = (int)(arr.length*0.25);
        for(int a: arr) {
            if(!m.keySet().contains(a)) {
                m.put(a, 1);
            } else {
                int v = m.get(a)+1;
                m.put(a, v);
            }
        }
        for(int k: m.keySet()) {
            if(m.get(k)>moreThanTwentyFive) {
                return k;
            }
        }
        return 0;
    }
}
