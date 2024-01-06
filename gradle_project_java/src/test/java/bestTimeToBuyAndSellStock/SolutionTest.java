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

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals(7,s.maxProfit(new int[]{7,1,5,3,6,4}));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertEquals(4,s.maxProfit(new int[]{1,2,3,4,5}));
    }

    @Test
    public void test4() {
        Solution s = new Solution();
        Assert.assertEquals(0,s.maxProfit(new int[]{7,6,4,3,1}));
    }

    @Test
    public void test5() {
        Solution s = new Solution();
        Assert.assertEquals(4,s.maxProfit(new int[]{1,2,3,4,5}));
    }
}
