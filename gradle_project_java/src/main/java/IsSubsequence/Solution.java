package IsSubsequence;

import java.util.*;

public class Solution {
    public boolean isSubsequence(String s, String t) {
        Map<Character, List<Integer>> map = new HashMap<>();
        for(int i=0; i<t.length(); i++) {
            if(map.containsKey(t.charAt(i))) {
                List<Integer> v = map.get(t.charAt(i));
                v.add(i);
                map.put(t.charAt(i), v);
            } else {
                List<Integer> v = new ArrayList<>();
                v.add(i);
                map.put(t.charAt(i), v);
            }
        }
        List<Integer> idxs = new ArrayList<>();
        idxs.add(-1);
        for(int i=0; i<s.length(); i++) {
            if(map.containsKey(s.charAt(i))) {
                List<Integer> vs = map.get(s.charAt(i));
                if(vs != null && vs.size() > 0) {
                    for(int j=0; j<vs.size(); j++) {
                        int v = vs.get(j);
                        if(idxs.get(idxs.size()-1) < v) {
                            idxs.add(v);
                            vs.remove(j);
                            map.put(s.charAt(i), vs);
                            break;
                        }
                    }

                }
            }
        }
        idxs.remove(0);
        if(idxs.size() == s.length())
            return true;
        return false;
    }

    public boolean isSubsequence1(String s, String t) {
        int i=0,j=0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)) i++;
            j++;
        }
        return i==s.length();
    }
}
