package binaryGap;

import BinaryGap.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(3, s.binaryGap(9));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals(2, s.binaryGap(22));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertEquals(0, s.binaryGap(8));
    }

    @Test
    public void test4() {
        Solution s = new Solution();
        Assert.assertEquals(2, s.binaryGap(5));
    }
}
