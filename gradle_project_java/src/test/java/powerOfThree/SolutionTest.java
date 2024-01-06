package powerOfThree;

import PowerOfThree.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertTrue(s.isPowerOfThree(3));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertTrue(s.isPowerOfThree(27));
    }
}
