package FindLuckyIntegerInAnArray;

import java.util.SortedSet;
import java.util.TreeSet;

public class Solution {
    public int findLucky(int[] arr) {
        int [] values = new int[501];
        for(int a: arr) {
            values[a]++;
        }
        SortedSet<Integer> s = new TreeSet<>();
        for(int i=1; i<values.length; i++) {
            if(i == values[i]) {
                s.add(i);
            }
        }
        if(s.size() == 0)
            return -1;
        return s.last();
    }
}
