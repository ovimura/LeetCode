package MakeTheStringGreat;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String makeGood(String s) {
        StringBuilder result = new StringBuilder();
        List<Character> chars = new ArrayList<>();
        for(char c: s.toCharArray()) {
            chars.add(c);
        }
        int i = 0, r = 0;
        if(chars.size()>=2)
            while(chars.size()>1) {
                char lc = Character.toLowerCase(chars.get(i));
                char uc = Character.toUpperCase(chars.get(i));
                if((lc == chars.get(i) && uc == chars.get(i+1)) || (uc == chars.get(i) && lc == chars.get(i+1))) {
                    chars.remove(i);
                    chars.remove(i);
                    r++;
                    i = 0;
                } else
                    i++;
                if(chars.size()-1 == i) {
                    i = 0;
                    if(r == 0)
                        break;
                    else
                        r = 0;
                }
            }
        else if(chars.size() == 1) {
            return s;
        } else {
            char lc = Character.toLowerCase(chars.get(i));
            char uc = Character.toUpperCase(chars.get(i));
            if((lc == chars.get(i) && uc == chars.get(i+1)) || (uc == chars.get(i) && lc == chars.get(i+1))) {
                chars.remove(i);
                chars.remove(i+1);
            }
        }
        for(char c: chars)
            result.append(c);
        return result.toString();
    }
}
