package UncommonWordsFromTwoSentences;

import java.util.*;

public class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        List<String> uncommon = new ArrayList<>();
        Map<String, Integer> ms1 = new Hashtable<>();
        Map<String, Integer> ms2 = new Hashtable<>();
        for(String w: s1.split(" ")) {
            if(!ms1.keySet().contains(w)) {
                ms1.put(w, 1);
            } else {
                int v = ms1.get(w)+1;
                ms1.put(w, v);
            }
        }
        for(String w: s2.split(" ")) {
            if(!ms2.keySet().contains(w)) {
                ms2.put(w, 1);
            } else {
                int v = ms2.get(w)+1;
                ms2.put(w, v);
            }
        }
        for(String k: ms1.keySet()) {
            if(ms1.get(k) == 1 && !ms2.keySet().contains(k)) {
                uncommon.add(k);
            }
        }
        for(String k: ms2.keySet()) {
            if(ms2.get(k) == 1 && !ms1.keySet().contains(k)) {
                uncommon.add(k);
            }
        }
        return uncommon.toArray(new String[]{});
    }
}
