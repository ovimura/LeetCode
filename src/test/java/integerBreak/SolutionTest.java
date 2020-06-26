package integerBreak;

import org.junit.Assert;
import org.junit.Test;
import IntegerBreak.Solution;

public class SolutionTest {
    @Test
    public void test1rec() {
        Solution s = new Solution();
        Assert.assertEquals(1, s.integerBreakRec(2));
    }
    @Test
    public void test2rec() {
        Solution s = new Solution();
        Assert.assertEquals(36, s.integerBreakRec(10));
    }

    @Test
    public void test1dp() {
        Solution s = new Solution();
        Assert.assertEquals(1, s.integerBreakDP(2));
    }
    @Test
    public void test2dp() {
        Solution s = new Solution();
        Assert.assertEquals(36, s.integerBreakDP(10));
    }

    @Test
    public void test3dp() {
        Solution s = new Solution();
        Assert.assertEquals(36, s.integerBreak1(10));
    }
    @Test
    public void test4dp() {
        Solution s = new Solution();
        Assert.assertEquals(36, s.integerBreak2(10));
    }
}
