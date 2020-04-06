package bestTimeToBuyAndSellStock;

import BestTimeToBuyAndSellStock.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(0,s.maxProfit(new int[]{}));
    }
}
