package DistributeCandies;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> types = new HashSet<>();
        for(int i: candyType) {
            types.add(i);
        }
        int eat = candyType.length/2;
        if(types.size() <= eat)
            return types.size();
        else
            return eat;
    }
}
