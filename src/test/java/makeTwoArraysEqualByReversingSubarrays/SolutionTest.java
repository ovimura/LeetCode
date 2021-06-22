package makeTwoArraysEqualByReversingSubarrays;

import MakeTwoArraysEqualByReversingSubarrays.Solution;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(true, s.canBeEqual(new int[]{1,2,3,4}, new int[]{2,4,1,3}));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals(true, s.canBeEqual(new int[]{7}, new int[]{7}));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertEquals(true, s.canBeEqual(new int[]{1,12}, new int[]{12,1}));
    }

    @Test
    public void test4() {
        Solution s = new Solution();
        Assert.assertEquals(false, s.canBeEqual(new int[]{3,7,9}, new int[]{3,7,11}));
    }

    @Test
    public void test5() {
        Solution s = new Solution();
        Assert.assertEquals(true, s.canBeEqual(new int[]{1,1,1,1,1}, new int[]{1,1,1,1,1}));
    }
}
