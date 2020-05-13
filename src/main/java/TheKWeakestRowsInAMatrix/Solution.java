package TheKWeakestRowsInAMatrix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        List<Integer[]> count = new ArrayList<>();
        int n;
        for(int i=0; i<mat.length; i++) {
            n = 0;
            for(int j=0; j<mat[i].length; j++) {
                if(mat[i][j] == 1)
                {
                    n++;
                }
            }
            count.add(new Integer[]{i, n});
        }
        Collections.sort(count, new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                return Integer.compare(o1[0], o2[0]);
            }
        });
        Collections.sort(count, new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                    return Integer.compare(o1[1], o2[1]);
            }
        });
        int [] res = new int[k];
        for(int i=0; i<k; i++) {
            res[i] = count.get(i)[0];
        }
        return res;
    }
}
