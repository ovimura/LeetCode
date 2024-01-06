package CountBinarySubstrings;

public class Solution {
    public int countBinarySubstrings(String s) {
        int[] g = new int[s.length()];
        int t = 0;
        g[0] = 1;
        for(int i=1; i<s.length(); i++) {
            if(s.charAt(i-1) != s.charAt(i)) {
                g[++t] = 1;
            } else {
                g[t]++;
            }
        }
        int ans = 0;
        for(int i=1; i<=t; i++) {
            ans += Math.min(g[i-1], g[i]);
        }
        return ans;
    }
}
