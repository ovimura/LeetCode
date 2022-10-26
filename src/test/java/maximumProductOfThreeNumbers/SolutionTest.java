package maximumProductOfThreeNumbers;

import MaximumProductOfThreeNumbers.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(6, s.maximumProduct(new int[]{1,2,3}));
    }
}
