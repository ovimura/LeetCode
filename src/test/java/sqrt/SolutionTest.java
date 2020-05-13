package sqrt;

import Sqrt.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(7, s.sqrt(55));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals(7, s.sqrt_root(55));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertEquals(7, s.mySqrt(55));
    }
}
