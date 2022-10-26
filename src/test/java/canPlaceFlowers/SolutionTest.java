package canPlaceFlowers;

import CanPlaceFlowers.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(true,s.canPlaceFlowers(new int[]{1,0,0,0,1}, 1));
    }
}
