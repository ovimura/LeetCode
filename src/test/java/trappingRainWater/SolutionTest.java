package trappingRainWater;

import TrappingRainWater.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        int[] heights = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        Assert.assertEquals(6, s.trap(heights));
    }
}
