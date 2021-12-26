package powerOfFour;

import PowerOfFour.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(false, s.isPowerOfFour(5));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals(true, s.isPowerOfFour(4));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertEquals(true, s.isPowerOfFour(16));
    }
}
