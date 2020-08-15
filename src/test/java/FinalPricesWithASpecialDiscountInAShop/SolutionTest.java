package finalPricesWithASpecialDiscountInAShop;

import FinalPricesWithASpecialDiscountInAShop.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testFinalPrices() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[1], s.finalPrices(new int[1]));
    }
}
