package numberOf1Bits;

import NumberOf1Bits.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(1, s.hammingWeight(2));
        Assert.assertEquals(3, s.hammingWeight(11));
    }
}
