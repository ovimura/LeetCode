package RankTransformOfAnArray;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] arrayRankTransform(int[] arr) {
        if(arr.length == 0)
            return new int[]{};
        int[] r = new int[arr.length];
        for(int i=0; i<arr.length; i++) {
            r[i] = arr[i];
        }
        Arrays.sort(r);
        int rank = 1;
        Map<Integer, Integer> m = new HashMap<>();
        m.put(r[0], rank);
        for(int i=1; i<r.length; i++) {
            if(r[i-1] == r[i]){
                m.put(r[i], rank);
            } else {
                rank++;
                m.put(r[i], rank);
            }
        }
        int[] ranking = new int[r.length];
        for(int i=0; i<ranking.length; i++) {
            ranking[i] = m.get(arr[i]);
        }
        return ranking;
    }
}
