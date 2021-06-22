package SortIntegersByTheNumberOf1Bits;

import java.util.*;

public class Solution {
    public int[] sortByBits(int[] arr) {
        Map<Integer, List<Integer>> bits = new HashMap<>();
        int[] rs = new int[arr.length];
        for(int b: arr) {
            int count = 0;
            int n = b;
            while (n > 0) {
                count += n & 1;
                n >>= 1;
            }
            if(!bits.keySet().contains(count)) {
                List<Integer> list = new ArrayList<>();
                list.add(b);
                bits.put(count, list);
            } else {
                List<Integer> ints = bits.get(count);
                ints.add(b);
                bits.put(count, ints);
            }
        }
        Set<Integer> keys = bits.keySet();
        int i=0;
        Integer[] ks = new Integer[keys.size()];
        int z=0;
        for(Integer a: keys)
            ks[z++] = a;
        Arrays.sort(ks);
        for(Integer k: ks) {
            if(bits.get(k).size() == 1)
                rs[i++] = bits.get(k).get(0);
            else {
                List<Integer> ints = bits.get(k);
                Collections.sort(ints);
                for(int n: ints) {
                    rs[i++] = n;
                }
            }
        }
        return rs;
    }
}
