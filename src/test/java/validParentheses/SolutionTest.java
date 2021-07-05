package validParentheses;

import ValidParentheses.Solution;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(true, s.isValid("()"));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals(true, s.isValid("()[]{}"));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertEquals(false, s.isValid("(]"));
    }

    @Test
    public void test4() {
        Solution s = new Solution();
        Assert.assertEquals(false, s.isValid("([)]"));
    }

    @Test
    public void test5() {
        Solution s = new Solution();
        Assert.assertEquals(true, s.isValid("{[]}"));
    }
}
