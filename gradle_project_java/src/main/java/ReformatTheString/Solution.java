package ReformatTheString;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String reformat(String s) {
        List<Character> letters = new ArrayList<>();
        List<Character> digits = new ArrayList<>();
        for(char c: s.toCharArray()) {
            if(c>='a' && c<='z')
                letters.add(c);
            else
                digits.add(c);
        }
        if(Math.abs(letters.size()-digits.size()) >= 2) {
            return "";
        } else {
            StringBuilder r = new StringBuilder();
            if(letters.size() == digits.size()) {
                while (letters.size() > 0 || digits.size() > 0) {
                    if (letters.size() > 0) {
                        r.append(letters.remove(0));
                    }
                    if (digits.size() > 0) {
                        r.append(digits.remove(0));
                    }
                }
            } else if(letters.size() > digits.size()) {
                r.append(letters.remove(0));
                while(letters.size()>0) {
                    r.append(digits.remove(0));
                    r.append(letters.remove(0));
                }
            } else if(letters.size() < digits.size()) {
                r.append(digits.remove(0));
                while(digits.size()>0) {
                    r.append(letters.remove(0));
                    r.append(digits.remove(0));
                }
            }
            return r.toString();
        }
    }
}
