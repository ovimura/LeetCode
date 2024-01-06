package wildcardMatching;

import org.junit.Assert;
import org.junit.Test;
import WildcardMatching.Solution;


public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(false, s.isMatch("aa", "a"));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals(true, s.isMatch("aa", "*"));
    }
}
