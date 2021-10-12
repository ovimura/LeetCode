package PascalSTriangle;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0; i<numRows; i++) {
            if(i==0) {
                List<Integer> temp = new ArrayList<>();
                temp.add(1);
                result.add(temp);
            } else if (i == 1) {
                List<Integer> temp = new ArrayList<>();
                temp.add(1);
                temp.add(1);
                result.add(temp);
            } else if (i >= 2) {
                int idx = i;
                List<Integer> temp = new ArrayList<>();
                temp.add(1);
                List<Integer> above = result.get(i-1);
                for(int j=1; j<idx; j++) {
                    temp.add(above.get(j-1) + above.get(j));
                }
                temp.add(1);
                result.add(temp);
            }
        }
        return result;
    }
}
