package addBinary;

import AddBinary.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals("1110", s.addBinary("111", "111"));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals("100", s.addBinary("11", "1"));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertEquals("10101", s.addBinary("1010", "1011"));
    }
}
