package BestTimeToBuyAndSellStock;

public class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 1)
            return 0;
        int profit = 0;
        for(int i=0; i<prices.length; i++) {
            while(i<prices.length-1 && prices[i]>=prices[i+1])
                i++;
            if(i == prices.length-1)
                return profit;
            int b = prices[i];
            while(i<prices.length-1 && prices[i+1]>=prices[i])
                i++;
            int s = prices[i];
            profit += s-b;

        }
        return profit;
    }

    public int maxProfit1(int[] prices) {
        int i = 0;
        int valley = prices[0];
        int peak = prices[0];
        int maxprofit = 0;
        while (i < prices.length - 1) {
            while (i < prices.length - 1 && prices[i] >= prices[i + 1])
                i++;
            valley = prices[i];
            while (i < prices.length - 1 && prices[i] <= prices[i + 1])
                i++;
            peak = prices[i];
            maxprofit += peak - valley;
        }
        return maxprofit;
    }
}
