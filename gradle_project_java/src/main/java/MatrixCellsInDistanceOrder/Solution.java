package MatrixCellsInDistanceOrder;

import java.util.*;

public class Solution {
    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        int[][] cells = new int[R*C][2];
        Map<Integer, List<Integer[]>>  dist = new HashMap<>();
        for(int r=0; r<R; r++) {
            for(int c=0; c<C; c++) {
                int k = Math.abs(r - r0) + Math.abs(c - c0);
                if(!dist.keySet().contains(k)) {
                    List<Integer[]> p = new ArrayList<>();
                    p.add(new Integer[]{r, c});
                    dist.put(k,p);
                } else {
                    List<Integer[]> ps = dist.get(k);
                    ps.add(new Integer[]{r, c});
                    dist.put(k, ps);
                }
            }
        }
        List<Integer> keys = new ArrayList<>(dist.keySet());
        Collections.sort(keys);
        for(int i=0; i<R*C; i++) {
            List<Integer[]> ps = dist.get(keys.remove(0));
            for(Integer[] p: ps) {
                cells[i][0] = p[0];
                cells[i][1] = p[1];
                i++;
            }
            i--;
        }
        return cells;
    }
}
