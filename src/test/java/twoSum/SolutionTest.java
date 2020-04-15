package twoSum;

import TwoSum.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{0,1}, s.twoSum(new int[]{2, 7, 11, 15}, 9));
    }
    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{0,1}, s.twoSum1(new int[]{2, 7, 11, 15}, 9));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{0,1}, s.twoSum2(new int[]{2, 7, 11, 15}, 9));
    }
}
