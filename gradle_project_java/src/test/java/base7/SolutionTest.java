package base7;

import Base7.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals("204", s.convertToBase7(102));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals("-10", s.convertToBase7(-7));
    }
}
