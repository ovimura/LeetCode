package countingBits;

import CountingBits.Solution;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        int[] a = s.countBits(5);
        Assert.assertArrayEquals(new int[]{0,1,1,2,1,2}, a);
    }
}
