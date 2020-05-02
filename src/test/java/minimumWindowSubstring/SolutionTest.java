package minimumWindowSubstring;

import MinimumWindowSubstring.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        String S = "ADOBECODEBANC";
        String T = "ABC";
        Solution s = new Solution();
        Assert.assertEquals("BANC", s.minWindow(S, T));
    }

    @Test
    public void test2() {
        String S = "aab";
        String T = "A";
        Solution s = new Solution();
        Assert.assertEquals("", s.minWindow(S, T));
    }

    @Test
    public void test3() {
        String S = "abc";
        String T = "cba";
        Solution s = new Solution();
        Assert.assertEquals("abc", s.minWindow(S, T));
    }

    @Test
    public void test4() {
        String S = "ADOBECODEBANC";
        String T = "";
        Solution s = new Solution();
        Assert.assertEquals("", s.minimumWindow(S, T));
    }

    @Test
    public void test5() {
        String S = "ab";
        String T = "A";
        Solution s = new Solution();
        Assert.assertEquals("", s.minimumWindow(S, T));
    }

    @Test
    public void test6() {
        String S = "abc";
        String T = "cba";
        Solution s = new Solution();
        Assert.assertEquals("abc", s.minimumWindow(S, T));
    }
}
