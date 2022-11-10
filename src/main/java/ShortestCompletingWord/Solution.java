package ShortestCompletingWord;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public String shortestCompletingWord_orig(String licensePlate, String[] words) {
        HashMap<Character, Integer> m = new HashMap<Character, Integer>();
        int licensePlateSize = licensePlate.length();
        for(int i=0;i<licensePlateSize;i++){
            char x = licensePlate.charAt(i);
            if((x>='A' && x<='Z') || (x>='a' && x<='z'))
                m.put(Character.toLowerCase(x), m.containsKey(Character.toLowerCase(x)) ? (m.get(Character.toLowerCase(x)) + 1) : 1);
        }
        String answer = "aaaaaaaaaaaaaaaa";
        for(String word: words){
            HashMap<Character, Integer> mm = new HashMap<Character, Integer>();
            int wordSize = word.length();
            for(int i=0;i<wordSize;i++){
                char x = word.charAt(i);
                if((x>='A' && x<='Z') || (x>='a' && x<='z'))
                    mm.put(Character.toLowerCase(x), mm.containsKey(Character.toLowerCase(x)) ? (mm.get(Character.toLowerCase(x)) + 1) : 1);
            }
            boolean cant = false;
            for(char i='a';i<='z';i++){
                int a = m.containsKey(i) ? m.get(i) : 0;
                int b = mm.containsKey(i) ? mm.get(i) : 0;
                if(b < a)
                    cant = true;
            }
            if(cant == false){
                if(word.length() < answer.length())
                    answer = word;
            }
        }
        return answer;
    }


    public String shortestCompletingWord(String licensePlate, String[] words) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<licensePlate.length(); i++) {
            char c = Character.toLowerCase(licensePlate.charAt(i));
            if((c <= 'z' && c >= 'a' || c >= 'A' && c <= 'Z') && map.get(c) == null) {
                map.put(Character.toLowerCase(c), 1);
            } else if (c <= 'z' && c >= 'a' || c >= 'A' && c <= 'Z'){
                int v = map.get(Character.toLowerCase(c))+1;
                map.put(c, v);
            }
        }
        List<String> slist = new ArrayList<>();
        for(String w: words) {
            Map<Character, Integer> wmap = new HashMap<>();
            for(int k=0; k<w.length(); k++) {
                char c = w.charAt(k);
                c = Character.toLowerCase(c);
                if(c <= 'z' && c >= 'a' && wmap.get(c) == null) {
                    wmap.put(c, 1);
                } else if (c <= 'z' && c >= 'a'){
                    int v = wmap.get(c)+1;
                    wmap.put(c, v);
                }
            }
            boolean f = false;
            int siz = map.keySet().size();
            int z = 0;
            for(char k: map.keySet()) {
                if(wmap.get(k) != null && wmap.get(k)<map.get(k)) {
                    f = true;
                } else if (wmap.get(k) != null && wmap.get(k)>=map.get(k)) {
                    z++;
                }
            }
            if(!f && siz == z)
                slist.add(w);
            wmap.clear();
        }
        String shortest_word = slist.get(0);
        for(String s: slist) {
            if(s.length()<shortest_word.length())
                shortest_word = s;
        }
        return shortest_word;
    }
}
