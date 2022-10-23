package distributeCandies;

import DistributeCandies.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(3, s.distributeCandies(new int[]{1,1,2,2,3,3}));
    }
}
