package JewelsAndStones;

import java.util.HashMap;
import java.util.Hashtable;

public class Solution {
    public int numJewelsInStones(String J, String S) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int j=0; j<J.length(); j++) {
            map.put(J.charAt(j), 0);
        }
        for (int i=0; i<S.length(); i++) {
            if(map.keySet().contains(S.charAt(i))) {
                int v = map.get(S.charAt(i));
                map.put(S.charAt(i), ++v);
            }
        }
        int total = 0;
        for(char c: map.keySet()) {
            total += map.get(c);
        }
        return total;
    }

    public int numJewelsInStones2(String J, String S) {
        int cnt = 0;
        for (char j : J.toCharArray()) {
            for (char s : S.toCharArray()) {
                if (s == j) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
