package PascalsTriangleII;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> p = new ArrayList<>();
        for(int i = 0; i<=rowIndex; i++) {
            if(i == 0) {
                List<Integer> tmp = new ArrayList<>();
                tmp.add(1);
                p.add(tmp);
            } else if(i == 1) {
                List<Integer> tmp = new ArrayList<>();
                tmp.add(1);
                tmp.add(1);
                p.add(tmp);
            } else {
                List<Integer> tmp = new ArrayList<>();
                tmp.add(1);
                for(int j=1; j<i; j++) {
                    tmp.add(p.get(i-1).get(j-1) + p.get(i-1).get(j));
                }
                tmp.add(1);
                p.add(tmp);
            }
        }
        return p.get(rowIndex);
    }
}
