package MaximumScoreAfterSplittingAString;

import java.util.SortedSet;
import java.util.TreeSet;

public class Solution {
    public int maxScore(String s) {
        SortedSet<Integer> ms = new TreeSet<>();
        for(int i=1; i<=s.length()-1; i++) {
            int cz = 0;
            for(int ii = 0; ii<i; ii++) {
                if(s.charAt(ii) == '0')
                    cz++;
            }
            int co = 0;
            for(int iii = i; iii<s.length(); iii++) {
                if(s.charAt(iii) == '1')
                    co++;
            }
            ms.add(cz + co);
        }
        return ms.last();
    }
}
