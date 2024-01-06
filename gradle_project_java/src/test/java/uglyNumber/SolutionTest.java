package uglyNumber;

import UglyNumber.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(true, s.isUgly(3));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals(false, s.isUgly(14));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertEquals(true, s.isUgly(8));
    }

    @Test
    public void test4() {
        Solution s = new Solution();
        Assert.assertEquals(true, s.isUgly(1));
    }
}
