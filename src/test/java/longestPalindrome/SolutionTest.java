package longestPalindrome;

import LongestPalindrome.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test0() {
        Solution s = new Solution();
        Assert.assertEquals(7, s.longestPalindrome("abccccdd"));
    }

    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(7, s.longestPalindrome("abccccdd"));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals(1, s.longestPalindrome("a"));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertEquals(2, s.longestPalindrome("bb"));
    }
}
