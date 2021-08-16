package RomanToInteger;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    Map<String,Integer> roman = new HashMap<>();

    public int romanToInt(String s) {
        roman.put("I",1);
        roman.put("V",5);
        roman.put("X",10);
        roman.put("L",50);
        roman.put("C",100);
        roman.put("D",500);
        roman.put("M",1000);
        int result = 0;

        for(int i=0; i<s.length(); i++) {
            char c = Character.toUpperCase(s.charAt(i));
            if(i+1 < s.length() && c == 'I' && Character.toUpperCase(s.charAt(i+1)) == 'V') {
                result += 4;
                i++;
            } else if(i+1 < s.length() && c == 'I' && Character.toUpperCase(s.charAt(i+1)) == 'X') {
                result += 9;
                i++;
            } else if(i+1 < s.length() && c == 'X' && Character.toUpperCase(s.charAt(i+1)) == 'L') {
                result += 40;
                i++;
            } else if(i+1 < s.length() && c == 'X' && Character.toUpperCase(s.charAt(i+1)) == 'C') {
                result += 90;
                i++;
            } else if(i+1 < s.length() && c == 'C' && Character.toUpperCase(s.charAt(i+1)) == 'D') {
                result += 400;
                i++;
            } else if(i+1 < s.length() && c == 'C' && Character.toUpperCase(s.charAt(i+1)) == 'M') {
                result += 900;
                i++;
            } else {
                result += roman.get(String.valueOf(Character.toUpperCase(s.charAt(i))));
            }
        }
        return result;
    }
}
