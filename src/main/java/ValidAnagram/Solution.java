package ValidAnagram;

import java.util.Arrays;
import java.util.List;

public class Solution {
    public boolean isAnagram(String s, String t) {
        int i=0;
        if(s.length() == 0 && t.length() == 0)
            return true;
        if(s.length() != t.length())
            return false;
        StringBuilder sb = new StringBuilder(t);
        for (char c: s.toCharArray()) {
            for(int k=0; k<sb.length(); k++) {
                if(c == sb.charAt(k)) {
                    sb.deleteCharAt(k);
                    i++;
                    break;
                }
            }
        }
        if(i != s.length())
            return false;
        return true;
    }
}
