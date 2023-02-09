package CalculateMoneyInLeetcodeBank;

public class Solution {
    public int totalMoney(int n) {
        int r=0, w=1, d=1;
        for(int i=0; i<n; i++) {
            r += w+d-1;
            d++;
            if(d==8) {
                w++;
                d=1;
            }
        }
        return r;
    }
}
