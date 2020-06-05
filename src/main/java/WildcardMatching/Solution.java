package WildcardMatching;

import java.util.Arrays;

public class Solution {
    public boolean isMatch(String s, String p) {
        int n = s.length();
        int m = p.length();
        // empty pattern can only match with
        // empty string
        if (m == 0 && n==0)
            return true;
        // lookup table for storing results of
        // subproblems
        boolean[][] dp = new boolean[n + 1][m + 1];
        // initailze lookup table to false
//        for(int i = 0; i < n + 1; i++)
//            for(int k=0; k<dp[i].length; k++)
//                System.out.println(dp[i][k]);
//            Arrays.fill(dp[i], false);
        // empty pattern can match with empty string
        dp[0][0] = true;

        // Only '*' can match with empty string
        for (int j = 1; j <= m; j++)
            if (p.charAt(j - 1) == '*')
                dp[0][j] = dp[0][j - 1];

        // fill the table in bottom-up fashion
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= m; j++)
            {
                // Two cases if we see a '*'
                // a) We ignore '*'' character and move
                //    to next  character in the pattern,
                //     i.e., '*' indicates an empty sequence.
                // b) '*' character matches with ith
                //     character in input
                if (p.charAt(j - 1) == '*')
                    dp[i][j] = dp[i][j - 1] ||
                            dp[i - 1][j];
                    // Current characters are considered as
                    // matching in two cases
                    // (a) current character of pattern is '?'
                    // (b) characters actually match
                else if (p.charAt(j - 1) == '?' ||
                        s.charAt(i - 1) == p.charAt(j - 1))
                    dp[i][j] = dp[i - 1][j - 1];
                    // If characters don't match
                else dp[i][j] = false;
            }
        }
        return dp[n][m];
    }
}
