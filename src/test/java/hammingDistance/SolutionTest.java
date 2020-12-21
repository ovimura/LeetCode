package hammingDistance;

import HammingDistance.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(2, s.hammingDistance(1, 4));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals(3, s.hammingDistance(1, 177));
    }
}
