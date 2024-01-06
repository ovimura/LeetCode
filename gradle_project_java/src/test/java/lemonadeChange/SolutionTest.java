package lemonadeChange;

import LemonadeChange.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertTrue(s.lemonadeChange(new int[]{5,5,5,10,20}));
    }
}
