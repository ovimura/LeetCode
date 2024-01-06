package GoatLatin;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String toGoatLatin(String S) {
        List<String> strs = new ArrayList<>();
        String[] ws = S.split(" ");
        int i = 0;
        for(String s: ws) {
            String w = "";
            if(s.charAt(0) == 'a' || s.charAt(0) == 'e' || s.charAt(0) == 'i' || s.charAt(0) == 'o' || s.charAt(0) == 'u'
            || s.charAt(0) == 'A' || s.charAt(0) == 'E' || s.charAt(0) == 'I' || s.charAt(0) == 'O' || s.charAt(0) == 'U') {
                w = s + "ma";
            } else {
                w = s.substring(1) + s.charAt(0) + "ma";
            }
            for(int j=0; j<=i; j++) {
                w = w + "a";
            }
            strs.add(w);
            i++;
        }
        String result = "";
        for(String n: strs)
            result = result + " " + n;
        return result.trim();
    }
}
