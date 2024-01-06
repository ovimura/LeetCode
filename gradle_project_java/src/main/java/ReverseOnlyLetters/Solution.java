package ReverseOnlyLetters;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String reverseOnlyLetters(String s) {
        List<Character> characters = new ArrayList<>();
        char [] cars = s.toCharArray();
        for(char c: cars) {
            if(c >= 'a' && c<= 'z' || c >= 'A' && c <= 'Z') {
                characters.add(c);
            }
        }
        char[] chars = new char[s.length()];
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                char cc = characters.remove(characters.size()-1);
                chars[i] = cc;
            } else {
                chars[i] = s.charAt(i);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<chars.length; i++) {
            sb.append(chars[i]);
        }
        return sb.toString();
    }
}
