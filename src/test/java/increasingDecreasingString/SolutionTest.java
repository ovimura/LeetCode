package increasingDecreasingString;

import IncreasingDecreasingString.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        String str = "aaaabbbbcccc";
        Assert.assertEquals("abccbaabccba",s.sortString(str));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        String str = "rat";
        Assert.assertEquals("art",s.sortString(str));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        String str = "leetcode";
        Assert.assertEquals("cdelotee",s.sortString(str));
    }

    @Test
    public void test4() {
        Solution s = new Solution();
        String str = "ggggggg";
        Assert.assertEquals("ggggggg",s.sortString(str));
    }

    @Test
    public void test5() {
        Solution s = new Solution();
        String str = "spo";
        Assert.assertEquals("ops",s.sortString(str));
    }
}
