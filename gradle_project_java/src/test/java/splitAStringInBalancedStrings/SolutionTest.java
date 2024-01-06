package splitAStringInBalancedStrings;

import SplitAStringInBalancedStrings.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(4,s.balancedStringSplit("RLRRLLRLRL"));
    }
    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals(3,s.balancedStringSplit("RLLLLRRRLR"));
    }
    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertEquals(1,s.balancedStringSplit("LLLLRRRR"));
    }
    @Test
    public void test4() {
        Solution s = new Solution();
        Assert.assertEquals(2,s.balancedStringSplit("RLRRRLLRLL"));
    }
}
