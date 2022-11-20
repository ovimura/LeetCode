package MostCommonWord;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String str = paragraph.toLowerCase();
        StringBuilder sb = new StringBuilder(str);
        for(int i=0; i<sb.length(); i++) {
            if(sb.charAt(i) == ' ')
                continue;
            if(!(sb.charAt(i)>= 'a' && sb.charAt(i) <= 'z') && sb.charAt(i) != ',') {
                sb.deleteCharAt(i);
            } else if(sb.charAt(i) == ',') {
                sb.replace(i, i+1, " ");
            }
        }
        str = sb.toString();
        Map<String, Integer> m = new HashMap<>();
        for(String s: str.split(" ")) {
            if(s.equals(""))
                continue;
            boolean f = false;
            for(String b: banned) {
                if(b.toLowerCase().equals(s)) {
                    f = true;
                    break;
                }
            }
            if(!f) {
                if (!m.containsKey(s)) {
                    m.put(s, 1);
                } else {
                    Integer i = m.get(s);
                    i++;
                    m.put(s, i);
                }
            }
        }
        String s = "";
        int i = Integer.MIN_VALUE;
        for(String a: m.keySet()) {
            if(m.get(a) > i) {
                s = a;
                i = m.get(a);
            }
        }
        return s;
    }
}
