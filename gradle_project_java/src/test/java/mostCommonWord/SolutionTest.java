package mostCommonWord;

import MostCommonWord.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals("ball", s.mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.",
                new String[]{"hit"}));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals("b", s.mostCommonWord("a, a, a, a, b,b,b,c, c",
                new String[]{"a"}));
    }
}
