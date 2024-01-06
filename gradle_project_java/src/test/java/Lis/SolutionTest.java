package lis;

import org.junit.Assert;
import org.junit.Test;
import Lis.Solution;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(4, s.findNumberOfLIS(new int[]{1,3,5,4,7}));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals(5, s.findNumberOfLIS(new int[]{5,6,2,3,4,1,9,9,8,9,5}));
    }
}
