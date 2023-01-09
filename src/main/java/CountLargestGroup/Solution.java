package CountLargestGroup;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public int countLargestGroup(int n) {
        Map<Integer, List<Integer>> m = new HashMap<>();
        for(int i=1; i<=n; i++) {
            int sum = 0;
            String s = String.valueOf(i);
            char[] a = s.toCharArray();
            for(char c: a) {
                sum += Character.getNumericValue(c);
            }
            if(!m.keySet().contains(sum)) {
                List<Integer> ii = new ArrayList<>();
                ii.add(i);
                m.put(sum, ii);
            } else {
                List<Integer> ii = m.get(sum);
                ii.add(i);
                m.put(sum, ii);
            }
        }
        int max = Integer.MIN_VALUE;
        int count = 0;
        for(int k: m.keySet()) {
            List<Integer> v = m.get(k);
            if(v.size() > max)
                max = v.size();
        }
        for(int k: m.keySet()) {
            List<Integer> v = m.get(k);
            if(v.size() == max)
                count++;
        }
        return count;
    }
}
