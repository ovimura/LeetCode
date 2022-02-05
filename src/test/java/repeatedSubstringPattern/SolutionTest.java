package repeatedSubstringPattern;

import RepeatedSubstringPattern.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(true, s.repeatedSubstringPattern("abab"));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals(false, s.repeatedSubstringPattern("aba"));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertEquals(true, s.repeatedSubstringPattern("abcabcabcabc"));
    }

    @Test
    public void test4() {
        Solution s = new Solution();
        Assert.assertEquals(true, s.repeatedSubstringPattern_2("babbabbabbabbab"));
    }
}
