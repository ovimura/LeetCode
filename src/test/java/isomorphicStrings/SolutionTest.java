package isomorphicStrings;

import IsomorphicStrings.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(false, s.isIsomorphic("aa", "bs"));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals(false, s.isIsomorphic("bbbaaaba", "aaabbbba"));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertEquals(true, s.isIsomorphic("egg", "add"));
    }
}
