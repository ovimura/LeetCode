package DIStringMatch;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] diStringMatch(String S) {
        List<Integer> ints = new ArrayList<>();
        int[] rs = new int[S.length()+1];
        for(int i=0; i<=S.length(); i++) {
            ints.add(i);
        }
        int j = 0;
        for(j=0; j<S.length(); j++) {
            if(S.charAt(j) == 'I') {
                rs[j] = ints.remove(0);
            } else if(S.charAt(j) == 'D') {
                int last_idx = ints.size()-1;
                rs[j] = ints.remove(last_idx);
            }
        }
        rs[j] = ints.remove(0);
        return rs;
    }
}
