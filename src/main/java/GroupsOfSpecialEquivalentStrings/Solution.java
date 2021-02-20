package GroupsOfSpecialEquivalentStrings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int numSpecialEquivGroups(String[] A) {
        Set<String> seen = new HashSet();
        for (String S: A) {
            int[] count = new int[52];
            for (int i = 0; i < S.length(); ++i)
                count[S.charAt(i) - 'a' + 26 * (i % 2)]++;
            seen.add(Arrays.toString(count));
        }
        return seen.size();
    }

    public int numSpecialEquivGroups1(String[] A) {
        Set<String> rs = new HashSet<>();
        for(String s: A) {
            char[] w = new char[26*2];
            for(int i=0; i<s.length(); i++) {
                w[s.charAt(i) - 'a' + 26 *(i%2)]++;
            }
            rs.add(Arrays.toString(w));
        }
        return rs.size();
    }
}
