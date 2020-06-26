package IntegerBreak;

// Reference: https://medium.com/@gepphkat/dynamic-programming-343-integer-break-4aa8dde3ee0f
// Problem: https://leetcode.com/problems/integer-break/
public class Solution {
    private int[] memo;
    // Recursion Solution
    public int integerBreakRec(int n) {
        if(memo==null)
            memo = new int[n+1];
        memo[0] = 0;
        memo[1] = 1;
        memo[2] = 1;
        if(n>2)
            memo[3] = 2;
        if(memo[n] != 0)
            return memo[n];
        int gmax = -1;
        for(int i =2; i<=n/2; i++) {
            int n1 = i;
            int n2 = n-i;
            int max1 = getProductMax(n1);
            int max2 = getProductMax(n2);
            int max = max1 * max2;
            if(max > gmax)
                gmax = max;
        }
        memo[n] = gmax;
        return memo[n];
    }

    private int getProductMax(int n) {
        int max = integerBreakRec(n);
        if(max > n)
            return max;
        return n;
    }

    // Dynamic Programming Solution
    public int integerBreakDP(int n) {
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 0;
        dp[2] = 1;
        if(n > 2)
            dp[3] = 2;
        for(int i=4; i<=n; i++) {
            int gmax = -1;
            for (int j = 2; j <= i/2; j++) {
                int n1 = j;
                int n2 = i - j;
                int max1 = dp[n1] > n1 ? dp[n1] : n1;
                int max2 = dp[n2] > n2 ? dp[n2] : n2;
                int max = max1 * max2;
                if (gmax < max)
                    gmax = max;
            }
            dp[i] = gmax;
        }
        return dp[n];
    }

    // Another DP solution
    public int integerBreak1(int n) {
        if (n < 1) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 1;
        }
        if (n == 3) {
            return 2;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;
        for (int i = 4; i <= n; ++i) {
            int len = i / 2;
            for (int j = 1; j <= len; ++j) {
                dp[i] = Math.max(dp[i], dp[j] * dp[i - j]);
            }
        }
        return dp[n];
    }

    public int integerBreak2(int n) {
        int[] dp=new int[n+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                dp[i]=Math.max(dp[i],dp[i-j]*j);
                dp[i]=Math.max(dp[i],(i-j)*j);
            }
        }
        return dp[n];
    }
}
