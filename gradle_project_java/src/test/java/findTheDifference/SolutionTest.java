package findTheDifference;

import FindTheDifference.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals('e', s.findTheDifference("abcd","abcde"));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals('y', s.findTheDifference("","y"));
    }
}
