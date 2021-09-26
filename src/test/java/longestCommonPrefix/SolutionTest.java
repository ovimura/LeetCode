package longestCommonPrefix;

import LongestCommonPrefix.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals("fl", s.longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals("", s.longestCommonPrefix(new String[]{"dog","racecar","car"}));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertEquals("a", s.longestCommonPrefix(new String[]{"ab", "a"}));
    }
}
