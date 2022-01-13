package FindTheDifference;

import java.util.Arrays;

public class Solution {
    public char findTheDifference(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        int min = Math.min(s1.length, s2.length);
        for(int i=0; i<min; i++) {
            if(s2[i] != s1[i])
                return s2[i];
        }
        return s2[s2.length-1];
    }
}
