package LongestPalindrome;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> pal = new HashMap<>();
        for(int i=0; i<s.length();  i++) {
            if(pal.keySet().contains(s.charAt(i)) != true) {
                pal.put(s.charAt(i), 1);
            } else {
                int val = pal.get(s.charAt(i));
                val++;
                pal.put(s.charAt(i), val);
            }
        }
        int odd = 0;
        int len = 0;
        for(char k: pal.keySet()) {
            if(pal.get(k) % 2 == 0) {
                len += pal.get(k);
            } else if(pal.get(k) % 2 == 1) {
                odd++;
                int t = pal.get(k) - 1;
                if(t>0){
                    len += t;
                }
            }
        }
        if(odd>0)
            len++;
        return len;
    }
}
