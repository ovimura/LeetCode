package FirstUniqueCharacterInAString;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> m = new HashMap<>();
        for(int i=0; i<s.length(); i++) {
            Character c = s.charAt(i);
            if(m.keySet().contains(c)) {
                int v = m.get(c);
                v++;
                m.put(c, v);
            } else {
                m.put(c, 1);
            }
        }
        for(int j=0; j<s.length(); j++) {
            if(m.get(s.charAt(j)) == 1) {
                return j;
            }
        }
        return -1;
    }
}
