package NumberOfEquivalentDominoPairs;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int numEquivDominoPairs_not_accepted(int[][] dominoes) {
        int count = 0;
        for(int i=0; i<dominoes.length-1; i++) {
            System.out.println(dominoes[i][0] + " : " + dominoes[i][1]);
            for(int j=i+1; j<dominoes.length; j++) {
                System.out.println(dominoes[j][0] + " <> " + dominoes[j][1]);
                if((dominoes[i][0] == dominoes[j][0] && dominoes[i][1] == dominoes[j][1]) ||
                        (dominoes[i][0] == dominoes[j][1] && dominoes[i][1] == dominoes[j][0])) {
                    count++;
                }
            }
        }
        return count;
    }

    public int numEquivDominoPairs(int[][] dominoes) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<dominoes.length; i++) {
            int low = Math.min(dominoes[i][0], dominoes[i][1]);
            int high = Math.max(dominoes[i][0], dominoes[i][1]);
            int k = 10*low + high;
            count += map.getOrDefault(k, 0);
            map.put(k, map.getOrDefault(k, 0)+1);
        }
        return count;
    }
}
