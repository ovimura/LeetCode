package IsomorphicStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] countS = new int[326];
        int[] countT = new int[326];
        Arrays.fill(countS, -1);
        Arrays.fill(countT, -1);
        for(int i=0; i<s.length(); i++) {
            if(countS[s.charAt(i)] == -1 && countT[t.charAt(i)] == -1) {
                countS[s.charAt(i)] = t.charAt(i);
                countT[t.charAt(i)] = s.charAt(i);
            } else if(!(countS[s.charAt(i)] == t.charAt(i) && countT[t.charAt(i)] == s.charAt(i)))
                return false;
        }
        return true;
    }
}
