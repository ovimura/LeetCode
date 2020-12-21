package dIStringMatch;

import DIStringMatch.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{}, s.diStringMatch("IDID"));
    }
}
