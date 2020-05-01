package topKFrequentElements;

import TopKFrequentElements.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        int[] nums = new int[]{1,1,1,2,2,3};
        Assert.assertArrayEquals(new int[]{1,2},s.topKFrequent(nums, 2));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        int[] nums = new int[]{1};
        Assert.assertArrayEquals(new int[]{1},s.topKFrequent(nums, 1));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        int[] nums = new int[]{1,1,1,2,2,3};
        Assert.assertArrayEquals(new int[]{1,2},s.topKFrequent1(nums, 2));
    }
}
