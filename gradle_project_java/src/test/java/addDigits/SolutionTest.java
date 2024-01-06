package addDigits;

import AddDigits.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(3, s.addDigits(345));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals(0, s.addDigits(0));
    }
}
