package powerOfTwo;

import PowerOfTwo.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(true, s.isPowerOfTwo(1));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals(true, s.isPowerOfTwo(16));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertEquals(false, s.isPowerOfTwo(3));
    }

    @Test
    public void test4() {
        Solution s = new Solution();
        Assert.assertEquals(true, s.isPowerOfTwo(4));
    }

    @Test
    public void test5() {
        Solution s = new Solution();
        Assert.assertEquals(false, s.isPowerOfTwo(5));
    }
}
