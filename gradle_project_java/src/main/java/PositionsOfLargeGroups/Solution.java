package PositionsOfLargeGroups;

import java.util.*;

public class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> lg = new ArrayList<>();
        int gstart=0;
        for(int i=0; i<s.length(); ++i) {
            if(i==s.length()-1 || s.charAt(i) != s.charAt(i+1)) {
                if(i-gstart+1 >= 3) {
                    lg.add(Arrays.asList(gstart, i));
                }
                gstart = i+1;
            }
        }
        return lg;
    }
}
