package FindWordsThatCanBeFormedByCharacters;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int countCharacters(String[] words, String chars) {
        Map<Character, Integer> cs = new HashMap<>();
        int sum = 0;
        for(String w: words) {
            for(int i=0; i<chars.length(); i++) {
                cs.put(chars.charAt(i), cs.getOrDefault(chars.charAt(i),0)+1);
            }
            int tmp = 0;
            for(int j=0; j<w.length(); j++) {
                int v = cs.getOrDefault(w.charAt(j), 0);
                if(v == 0) {
                    tmp = 0;
                    break;
                } else {
                    tmp++;
                    cs.put(w.charAt(j), --v);
                }
            }
            if(tmp > 0)
                sum += tmp;
            cs.clear();
        }
        return sum;
    }
}
