package rangeAdditionII;

import RangeAdditionII.*;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(4,s.maxCount(3, 3, new int[][]{{2,2},{3,3}}));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals(4,s.maxCount(3, 3, new int[][]{{2,2},{3,3}, {3,3},{3,3},{2,2},{3,3},{3,3},{3,3},{2,2},{3,3},{3,3},{3,3}}));
    }
}
