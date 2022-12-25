package threeConsecutiveOdds;

import ThreeConsecutiveOdds.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(false, s.threeConsecutiveOdds(new int[]{2,6,4,1}));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals(true, s.threeConsecutiveOdds(new int[]{1,2,34,3,4,5,7,23,12}));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertEquals(true, s.threeConsecutiveOdds(new int[]{1, 1, 1}));
    }
}
