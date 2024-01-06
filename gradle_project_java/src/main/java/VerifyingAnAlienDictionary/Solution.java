package VerifyingAnAlienDictionary;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        Map<Character, Integer> m = new HashMap<>();
        for(int i=0; i<order.length(); i++) {
            m.put(order.charAt(i), i);
        }
        for(int j=1; j<words.length; j++) {
            String w1 = words[j-1];
            String w2 = words[j];
            for(int k=0; k<w1.length(); k++) {
                if(k>=w2.length()) return false;
                if(w1.charAt(k) != w2.charAt(k)) {
                    if(m.get(w1.charAt(k)) > m.get(w2.charAt(k)))
                        return false;
                    else
                        break;
                }
            }
        }
        return true;
    }
}
