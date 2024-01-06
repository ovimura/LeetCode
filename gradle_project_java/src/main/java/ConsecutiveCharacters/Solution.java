package ConsecutiveCharacters;

import java.util.SortedSet;
import java.util.TreeSet;

public class Solution {
    public int maxPower(String s) {
        SortedSet<Integer> set = new TreeSet<>();
        char prev = '0';
        int count = 0;
        for(char c: s.toCharArray()) {
            if(prev == c) {
                count++;
                set.add(count+1);
            } else {
                set.add(count+1);
                prev = c;
                count = 0;
            }
        }
        return set.last();
    }
}
