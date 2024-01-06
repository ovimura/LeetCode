package FinalPricesWithASpecialDiscountInAShop;

public class Solution {
    public int[] finalPrices(int[] prices) {
        int[] res = new int[prices.length];
        for(int i=0; i<prices.length; i++) {
            res[i] = prices[i];
            for(int j=i+1; j<prices.length; j++) {
                if(prices[j] <= prices[i]) {
                    res[i] = prices[i] - prices[j];
                    break;
                }
            }
        }
        return res;
    }
}
