package buddyStrings;

import BuddyStrings.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertTrue(s.buddyStrings("zsdfasdaf", "zsdfasdfa"));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertTrue(s.buddyStrings("aa", "aa"));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertFalse(s.buddyStrings("abcaa", "abcbb"));
    }

    @Test
    public void test4() {
        Solution s = new Solution();
        Assert.assertTrue(s.buddyStrings("abab", "abab"));
    }
}
