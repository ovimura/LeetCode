package BestTimeToBuyAndSellStockI;

import java.util.Arrays;

public class Solution {
    public int maxProfit1(int[] prices) {
        int r = 0;
        for(int i=0; i<prices.length-1; i++) {
            for(int j=i+1; j<prices.length; j++) {
                if(prices[i]<prices[j]) {
                    if((prices[j]-prices[i]) > r) {
                        r = (prices[j]-prices[i]);
                    }
                }
            }
        }
        return r;
    }

    public int maxProfit(int prices[]) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice)
                minprice = prices[i];
            else if (prices[i] - minprice > maxprofit)
                maxprofit = prices[i] - minprice;
        }
        return maxprofit;
    }
}
