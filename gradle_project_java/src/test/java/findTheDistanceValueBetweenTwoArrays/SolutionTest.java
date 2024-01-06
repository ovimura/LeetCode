package findTheDistanceValueBetweenTwoArrays;

import FindTheDistanceValueBetweenTwoArrays.Solution;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(2, s.findTheDistanceValue(new int[]{4,5,8}, new int[]{10,9,1,8}, 2));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals(2, s.findTheDistanceValue(new int[]{1,4,2,3}, new int[]{-4,-3,6,10,20,30}, 3));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertEquals(1, s.findTheDistanceValue(new int[]{2,1,100,3}, new int[]{-5,-2,10,-3,7}, 6));
    }
}
