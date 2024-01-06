package relativeRanks;

import RelativeRanks.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        String[] ans = s.findRelativeRanks(new int[]{5,4,3,2,1});
        Assert.assertArrayEquals(new String[]{"Gold Medal","Silver Medal","Bronze Medal","4","5"},
                ans);
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        String[] ans = s.findRelativeRanks(new int[]{5,4,3});
        Assert.assertArrayEquals(new String[]{"Gold Medal","Silver Medal","Bronze Medal"},
                ans);
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        String[] ans = s.findRelativeRanks(new int[]{5,3,4});
        Assert.assertArrayEquals(new String[]{"Gold Medal","Bronze Medal","Silver Medal"},
                ans);
    }

    @Test
    public void test4() {
        Solution s = new Solution();
        String[] ans = s.findRelativeRanks(new int[]{});
        Assert.assertArrayEquals(new String[]{},
                ans);
    }
}
