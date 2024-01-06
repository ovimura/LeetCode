package longestUncommonSubsequenceI;

import LongestUncommonSubsequenceI.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(3, s.findLUSlength("aba", "cdc"));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals(-1, s.findLUSlength("aba","aba"));
    }

    public void test3() {
        Solution s = new Solution();
        Assert.assertEquals(-1, s.findLUSlength("aefawfawfawfaw","aefawfeawfwafwaef"));
    }
}