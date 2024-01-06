package addStrings;

import AddStrings.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals("3380",s.addStrings("125", "3255"));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals("533",s.addStrings("456", "77"));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertEquals("10", s.addStrings("1", "9"));
    }
}
