package maximumProductOfTwoElementsInAnArray;

import MaximumProductOfTwoElementsInAnArray.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(12, s.maxProduct(new int[]{3,4,5,2}));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals(16, s.maxProduct(new int[]{1,5,4,5}));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertEquals(12, s.maxProduct(new int[]{3,7}));
    }
}
