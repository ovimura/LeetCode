package sumOfAllSubsetXORTotals;

import org.junit.Assert;
import org.junit.Test;

import SumOfAllSubsetXORTotals.*;

public class SolutionTest {
    @Test
    public void test() {
        Solution s = new Solution();
        Assert.assertEquals(6, s.subsetXORSum(new int[]{1,3}));
        Assert.assertEquals(6, s.subsetXORSum1(new int[]{1,3}));
        Assert.assertEquals(6, s.subsetXORSum2(new int[]{1,3}));
    }

    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(28, s.subsetXORSum(new int[]{5,1,6}));
        Assert.assertEquals(28, s.subsetXORSum1(new int[]{5,1,6}));
        Assert.assertEquals(28, s.subsetXORSum2(new int[]{5,1,6}));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals(480, s.subsetXORSum(new int[]{3,4,5,6,7,8}));
        Assert.assertEquals(480, s.subsetXORSum1(new int[]{3,4,5,6,7,8}));
        Assert.assertEquals(480, s.subsetXORSum2(new int[]{3,4,5,6,7,8}));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertEquals(480, s.subsetXORSum1(new int[]{3,4,5,6,7,8}));
        Assert.assertEquals(480, s.subsetXORSum2(new int[]{3,4,5,6,7,8}));
    }
}
