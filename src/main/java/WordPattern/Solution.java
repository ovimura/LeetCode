package WordPattern;

import java.util.HashMap;
import java.util.Map;


public class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, Integer> p = new HashMap<Character, Integer>();
        Map<String, Integer> ss = new HashMap<String, Integer>();
        for(char c: pattern.toCharArray()) {
            if(!p.containsKey(c)) {
                p.put(c, 1);
            } else {
                int v = p.get(c);
                v++;
                p.put(c, v);
            }
        }
        for(String w: s.split(" ")) {
            if(!ss.containsKey(w)) {
                ss.put(w, 1);
            } else {
                int v = ss.get(w);
                v++;
                ss.put(w, v);
            }
        }
        if(p.keySet().size() != ss.keySet().size())
            return false;
        Map<Character, String> isBij = new HashMap<>();
        for(int i=0; i<pattern.length(); i++) {
            if(p.get(pattern.charAt(i)).equals(ss.get(s.split(" ")[i])) &&
                    !isBij.keySet().contains(pattern.charAt(i)) && !isBij.values().contains(s.split(" ")[i])) {
                isBij.put(pattern.charAt(i), s.split(" ")[i]);
            }
// optional
//            else if (p.get(pattern.charAt(i)).equals(ss.get(s.split(" ")[i])) && !isBij.get(pattern.charAt(i)).equals(s.split(" ")[i]))
//                return false;
        }
        StringBuilder sb = new StringBuilder();
        for(Character k: pattern.toCharArray())
            if(isBij.containsKey(k))
                sb.append(isBij.get(k) + " ");
        String result = sb.toString().trim();
        return result.equals(s);
    }

    public boolean wordPattern1(String pattern, String s) {

        String[] observed= s.split(" ");
        if(pattern.length()!=observed.length)
            return false;
        HashMap<Character, String> map_char=new HashMap<>();
        HashMap<String, Character> map_word=new HashMap<>();

        for(int i=0;i<observed.length;i++){
            char c=pattern.charAt(i);
            String w=observed[i];
            if(!map_char.containsKey(c)){
                if(map_word.containsKey(w)){
                    return false;
                } else{
                    map_char.put(c,w);
                    map_word.put(w,c);
                }
            } else{
                String mapped_word=map_char.get(c);
                if(!mapped_word.equals(w))
                    return false;
            }
        }

        return true;


    }
}
