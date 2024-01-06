package RansomNote;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        StringBuilder sb1 = new StringBuilder(ransomNote);
        StringBuilder sb2 = new StringBuilder(magazine);
        Map<Character, Integer> dict = new HashMap<>();
        for(int i=0; i<sb2.length(); i++) {
            if(!dict.keySet().contains(sb2.charAt(i))) {
                dict.put(sb2.charAt(i), 1);
            } else {
                int v = dict.get(sb2.charAt(i));
                v++;
                dict.put(sb2.charAt(i), v);
            }
        }
        StringBuilder sb3 = new StringBuilder();
        for(int j=0; j<sb1.length(); j++) {
            if(dict.keySet().contains(sb1.charAt(j)) && dict.get(sb1.charAt(j)) > 0) {
                int v = dict.get(sb1.charAt(j));
                v--;
                dict.put(sb1.charAt(j), v);
                sb3.append(sb1.charAt(j));
            }
        }
        return sb1.toString().equals(sb3.toString());
    }
}
