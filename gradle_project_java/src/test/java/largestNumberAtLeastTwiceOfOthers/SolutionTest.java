package largestNumberAtLeastTwiceOfOthers;

import LargestNumberAtLeastTwiceOfOthers.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(1,s.dominantIndex(new int[]{3,6,1,0}));
    }
}
