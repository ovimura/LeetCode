package ArrangingCoins;

public class Solution {
    public int arrangeCoins(int n) {
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else if(n == 2)
            return 1;
        int i=1;
        long  coins = 0;
        while(coins <= n) {
            coins += i;
            ++i;
        }
        return i-2;
    }
}
