package NamingACompany;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public long distinctNames(String[] ideas) {
        Set<String> set = new HashSet<>();
        for(String s: ideas)
            set.add(s);
        long[][] counter = new long[26][26];
        for(int i=0; i<ideas.length; i++) {
            StringBuilder sb = new StringBuilder(ideas[i]);
            char old = sb.charAt(0);
            for(char c='a'; c<='z'; c++) {
                if(c != old) {
                    sb.setCharAt(0, c);
                    if(!set.contains(sb.toString())) {
                        counter[old-'a'][c-'a']++;
                    }
                }
            }
        }
        long result = 0;
        for(int i=0; i<26; i++) {
            for(int j=0; j<26; j++) {
                result += counter[i][j] * counter[j][i];
            }
        }
        return result;
    }
}
