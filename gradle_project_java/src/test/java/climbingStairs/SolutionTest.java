package climbingStairs;

import ClimbingStairs.Solution;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(1, s.climbStairs(1));
        Assert.assertEquals(1, s.climbStairsBottomUp(1));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals(2, s.climbStairs(2));
        Assert.assertEquals(2, s.climbStairsBottomUp(2));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertEquals(3, s.climbStairs(3));
        Assert.assertEquals(3, s.climbStairsBottomUp(3));
    }
}
