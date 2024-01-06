package maximum69Number;

import Maximum69Number.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(9969, s.maximum69Number(9669));
    }
}
