package ShortestCompletingWord;

import java.util.HashMap;

public class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
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
}
