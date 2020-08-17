package finalPricesWithASpecialDiscountInAShop;

import FinalPricesWithASpecialDiscountInAShop.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testFinalPrices() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{4,2,4,2,3}, s.finalPrices(new int[]{8,4,6,2,3}));
    }

    @Test
    public void testFinalPrices1() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{1,2,3,4,5}, s.finalPrices(new int[]{1,2,3,4,5}));
    }

    @Test
    public void testFinalPrices2() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{9,0,1,6}, s.finalPrices(new int[]{10,1,1,6}));
    }
}
