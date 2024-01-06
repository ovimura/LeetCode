package removePalindromicSubsequences;

import RemovePalindromicSubsequences.Solution;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(1,s.removePalindromeSub("ababa"));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals(2,s.removePalindromeSub("abb"));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertEquals(2,s.removePalindromeSub("baabb"));
    }
}
