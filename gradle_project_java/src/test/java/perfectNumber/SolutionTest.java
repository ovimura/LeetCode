package perfectNumber;

import PerfectNumber.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(true, s.checkPerfectNumber(28));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals(false, s.checkPerfectNumber(7));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertEquals(false, s.checkPerfectNumber(99999997));
    }

    @Test
    public void test4() {
        Solution s = new Solution();
        Assert.assertEquals(false, s.checkPerfectNumber(2016));
    }
}
