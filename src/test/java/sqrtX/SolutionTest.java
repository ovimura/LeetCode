package sqrtX;

import SqrtX.Solution;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(35, s.mySqrt(1253));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals(3, s.mySqrt(12));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertEquals(2, s.mySqrt(4));
    }

    @Test
    public void test4() {
        Solution s = new Solution();
        Assert.assertEquals(291, s.mySqrt(84765));
    }

    @Test
    public void test5() {
        Solution s = new Solution();
        Assert.assertEquals(2, s.mySqrt(8));
    }

    @Test
    public void test6() {
        Solution s = new Solution();
        Assert.assertEquals(
                28441, s.mySqrt(808909662));
    }
}
