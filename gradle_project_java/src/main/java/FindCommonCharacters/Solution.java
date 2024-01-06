package FindCommonCharacters;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int count(char c, String w) {
        int n = 0;
        for(int i=0; i<w.length(); i++) {
            if (w.charAt(i) ==  c)
                n++;
        }
        return n;
    }

    public List<String> commonChars(String[] A) {
        List<String> result = new ArrayList<>();
        List<Character> duplicates = new ArrayList<>();
        for(int j=0; j<A[0].length(); j++) {
            char c = A[0].charAt(j);
            int w = count(c, A[0]);
            for(char cc: A[0].substring(0, j).toCharArray())
                if(cc == c)
                    duplicates.add(c);
            if(!duplicates.contains(c)) {
                for (int i = 1; i < A.length; i++) {
                    if (count(c, A[i]) < w)
                        w = count(c, A[i]);
                }
                if (w > 0)
                    for (int k = 0; k < w; k++)
                        result.add(Character.toString(c));
            }
        }
        return result;
    }
}
