package maximumNestingDepthOfTheParentheses;

import MaximumNestingDepthOfTheParentheses.*;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        assert 3 == s.maxDepth("(1+(2*3)+((8)/4))+1");
    }
}
