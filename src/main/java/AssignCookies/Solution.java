package AssignCookies;

import java.util.Arrays;

public class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int c = 0;
        for(int i=0; i<g.length; i++) {
            for(int j=0; j<s.length; j++) {
                if(g[i] <= s[j]) {
                    c++;
                    s[j] = -1;
                    break;
                }
            }
        }
        return c;
    }
}
