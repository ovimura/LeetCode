package binaryNumberWithAlternatingBits;

import BinaryNumberWithAlternatingBits.*;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertFalse(s.hasAlternatingBits(6));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertTrue(s.hasAlternatingBits(5));
    }
}
