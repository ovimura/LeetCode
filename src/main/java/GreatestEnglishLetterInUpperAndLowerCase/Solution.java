package GreatestEnglishLetterInUpperAndLowerCase;

import java.util.HashMap;
import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Solution {
    public String greatestLetter(String s) {
        char [] upper_alphabet = new char[26];
        char [] lower_alphabet = new char[26];
        for(char c: s.toCharArray()) {
            int upper = c-'A';
            int lower = c-'a';
            if(upper>=0 && upper<26) {
                if(upper_alphabet[upper] == 0)
                    upper_alphabet[upper]++;
            }
            if(lower>=0 && lower<26) {
                if(lower_alphabet[lower] == 0)
                    lower_alphabet[lower]++;
            }
        }
        StringBuilder sb = new StringBuilder();
        SortedSet<Character> ss = new TreeSet<>();
        for(int i=0; i<lower_alphabet.length; i++) {
            if(upper_alphabet[i] > 0 && lower_alphabet[i] > 0) {
                char c = 'A';
                c += i;
                ss.add(c);
            }
        }
        if(ss.size()>0)
            sb.append(ss.last());
        return sb.toString();
    }
}
