package detectCapital;

import DetectCapital.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(true, s.detectCapitalUse("USA"));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals(false, s.detectCapitalUse("UuSs"));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertEquals(true, s.detectCapitalUse("usdfs"));
    }
}
