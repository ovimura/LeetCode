package FindNearestPointThatHasTheSameXorYCoordinate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int idx = -1;
        Map<Integer, Integer> manhatans = new HashMap<>();
        for(int[]pts : points) {
            idx++;
            if(x == pts[0] || y == pts[1]) {
                int manhatan_tmp = Math.abs(x-pts[0]) + Math.abs(y-pts[1]);
                manhatans.put(idx, manhatan_tmp);
            }
        }
        int min = 10000000;
        for(int k: manhatans.keySet()) {
            if(manhatans.get(k) < min)
                min = manhatans.get(k);
        }
        Map<Integer, Integer> m = new HashMap<>();
        for(int k: manhatans.keySet()) {
            if(manhatans.get(k) == min)
                m.put(k, min);
        }
        idx = 100000;
        for(int k: m.keySet()) {
            if(k<idx)
                idx = k;
        }
        return (idx != 100000)? idx: -1;
    }
}
