package thirdMaximumNumber;

import ThirdMaximumNumber.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(1,s.thirdMax(new int[]{1,2,3}));
    }
}
