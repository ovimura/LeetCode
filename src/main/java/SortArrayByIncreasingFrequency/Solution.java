package SortArrayByIncreasingFrequency;

import java.util.*;

public class Solution {
    public int[] frequencySort(int[] nums) {
        int[] result = new int[nums.length];
        Map<Integer, Integer> freq = new HashMap<>();
        for(int i: nums) {
            if(!freq.keySet().contains(i)) {
                freq.put(i, 1);
            } else {
                int f = freq.get(i);
                freq.put(i, f+1);
            }
        }
        boolean done = false;
        int next = 0;
        while(!done) {
            int min = Integer.MAX_VALUE;
            for(int k: freq.keySet()) {
                if(freq.get(k)<min)
                    min = freq.get(k);
            }
            List<Integer[]> fs = new ArrayList<>();
            for(int i: freq.keySet()) {
                if(freq.get(i) == min)
                    fs.add(new Integer[]{i, freq.get(i)});
            }
            Collections.sort(fs, new Comparator<Integer[]>() {
                @Override
                public int compare(Integer[] o1, Integer[] o2) {
                    return o1[0]>o2[0]?-1:o1[0]<o2[0]?1:0;
                }
            });
            for(int z=0; z<fs.size(); z++) {
                int times = fs.get(z)[1];
                for(int a=0; a<times; a++) {
                    result[next] = fs.get(z)[0];
                    next++;
                }
                freq.remove(fs.get(z)[0]);
            }
            if(next == result.length)
                done = true;
        }
        return result;
    }
}
