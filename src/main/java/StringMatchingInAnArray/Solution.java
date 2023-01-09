package StringMatchingInAnArray;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public List<String> stringMatching(String[] words) {
        Set<String> s = new HashSet<>();
        List<String> r = new ArrayList<>();
        for(int i=0; i<words.length; i++) {
            for(int j=0; j<words.length; j++) {
                if(!words[j].equals(words[i]) && words[j].contains(words[i])) {
                    s.add(words[i]);
                }
            }
        }
        for(String a: s) {
            r.add(a);
        }
        return r;
    }
}
