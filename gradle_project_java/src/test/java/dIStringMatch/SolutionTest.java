package dIStringMatch;

import DIStringMatch.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{0,4,1,3,2}, s.diStringMatch("IDID"));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{0,1,2,3}, s.diStringMatch("III"));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{3,2,0,1}, s.diStringMatch("DDI"));
    }
}
