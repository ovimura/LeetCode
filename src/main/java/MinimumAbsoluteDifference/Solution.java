package MinimumAbsoluteDifference;

import java.util.*;

public class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> paris = new ArrayList<>();
        Map<Integer, List<int[]>> diffs = new HashMap<>();
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                int diff = Math.abs(arr[i] - arr[j]);
                if(diffs.keySet().contains(diff)) {
                    List<int[]> vals = diffs.get(diff);
                    vals.add(new int[]{arr[i], arr[j]});
                    diffs.put(diff, vals);
                } else {
                    List<int[]> vals = new ArrayList<>();
                    vals.add(new int[]{arr[i], arr[j]});
                    diffs.put(diff, vals);
                }
            }
        }
        int min = Integer.MAX_VALUE;
        for(int k: diffs.keySet()) {
            if(k<min)
                min = k;
        }
        List<int[]> temp = diffs.get(min);
        for(int[] tmp: temp) {
            List<Integer> t = new ArrayList<>();
            t.add(tmp[0]);
            t.add(tmp[1]);
            paris.add(t);
        }
        Collections.sort(paris, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                return o1.get(0)<o2.get(0)?-1:o1.get(0)>o2.get(0)?1:0;
            }
        });
        return paris;
    }
}
