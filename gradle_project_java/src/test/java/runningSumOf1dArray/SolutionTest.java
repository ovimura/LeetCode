package runningSumOf1dArray;

import org.junit.Assert;
import org.junit.Test;
import RunningSumOf1dArray.Solution;

public class SolutionTest {
    @Test
    public void test1() {
        int[] nums = new int[]{1,2,3,4};
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{1,3,6,10}, s.runningSum(nums));
    }
    @Test
    public void test2() {
        int[] nums = new int[]{1,1,1,1,1};
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{1,2,3,4,5}, s.runningSum(nums));
    }
    @Test
    public void test3() {
        int[] nums = new int[]{3,1,2,10,1};
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{3,4,6,16,17}, s.runningSum(nums));
    }
}
