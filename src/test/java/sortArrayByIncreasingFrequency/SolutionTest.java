package sortArrayByIncreasingFrequency;

import SortArrayByIncreasingFrequency.Solution;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{3,1,1,2,2,2},s.frequencySort(new int[]{1,1,2,2,2,3}));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{1,3,3,2,2},s.frequencySort(new int[]{2,3,1,3,2}));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{5,-1,4,4,-6,-6,1,1,1},s.frequencySort(new int[]{-1,1,-6,4,5,-6,1,4,1}));
    }
}
