package LastStoneWeight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length == 1) return stones[0];
        Arrays.sort(stones);
        List<Integer> s = new ArrayList<>();
        for (int stone : stones) {
            s.add(stone);
        }
        while(s.size()>1) {
            Collections.sort(s);
            if(s.size()>=2) {
                int i = s.remove(s.size()-1);
                int j = s.remove(s.size()-1);
                if(i != j)
                    s.add(i-j);
            }
        }
        return (s.size()==1)? s.get(0): 0;
    }
}
