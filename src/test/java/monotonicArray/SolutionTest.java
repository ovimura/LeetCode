package monotonicArray;

import MonotonicArray.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertTrue(s.isMonotonic(new int[]{1,2,2,3}));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertTrue(s.isMonotonic(new int[]{6,5,4,4}));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertFalse(s.isMonotonic(new int[]{1,3,2}));
    }
}
