package longPressedName;

import LongPressedName.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertTrue(s.isLongPressedName("alex", "aaleex"));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertFalse(s.isLongPressedName("saeed", "ssaaedd"));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertTrue(s.isLongPressedName("leelee", "lleelee"));
    }
}
