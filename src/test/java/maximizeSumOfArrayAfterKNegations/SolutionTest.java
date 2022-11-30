package maximizeSumOfArrayAfterKNegations;

import MaximizeSumOfArrayAfterKNegations.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(5, s.largestSumAfterKNegations(new int[]{4, 2, 3}, 1));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals(6, s.largestSumAfterKNegations(new int[]{3,-1,0,2}, 3));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertEquals(13, s.largestSumAfterKNegations(new int[]{2,-3,-1,5,-4}, 2));
    }

    @Test
    public void test4() {
        Solution s = new Solution();
        Assert.assertEquals(32, s.largestSumAfterKNegations(new int[]{-2,9,9,8,4}, 5));
    }

    @Test
    public void test5() {
        Solution s = new Solution();
        Assert.assertEquals(5, s.largestSumAfterKNegations(new int[]{-4,-2,-3}, 4));
    }
}
