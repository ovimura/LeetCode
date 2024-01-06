package longestHarmoniousSubsequence;

import LongestHarmoniousSubsequence.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(5, s.findLHS(new int[]{1,3,2,2,5,2,3,7}));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals(0, s.findLHS(new int[]{1,1,1,1,1}));
    }
}
