package removeOutermostParentheses;

import RemoveOutermostParentheses.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals("()()()", s.removeOuterParentheses("(()())(())"));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals("()()()()(())", s.removeOuterParentheses("(()())(())(()(()))"));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertEquals("", s.removeOuterParentheses("()()"));
    }
}
