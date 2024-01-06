package bestTimeToBuyAndSellStockI;

import BestTimeToBuyAndSellStockI.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(5, s.maxProfit(new int[]{7,1,5,3,6,4}));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals(0, s.maxProfit(new int[]{7,6,4,3,1}));
    }
}
