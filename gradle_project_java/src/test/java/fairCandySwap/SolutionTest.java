package fairCandySwap;

import FairCandySwap.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{1,2}, s.fairCandySwap(new int[]{1,1}, new int[]{2,2}));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{2,3}, s.fairCandySwap(new int[]{2}, new int[]{1,3}));
    }
}
