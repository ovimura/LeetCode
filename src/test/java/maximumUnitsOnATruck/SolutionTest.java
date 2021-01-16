package maximumUnitsOnATruck;

import org.junit.Assert;
import org.junit.Test;

import MaximumUnitsOnATruck.Solution;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(8, s.maximumUnits(new int[][]{{1,3},{2,2},{3,1}}, 4));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals(91, s.maximumUnits(new int[][]{{5,10},{2,5},{4,7},{3,9}}, 10));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertEquals(76, s.maximumUnits(new int[][]
                {{1,3},{5,5},{2,5},{4,2},{4,1},{3,1},{2,2},{1,3},{2,5},{3,2}}, 35));
    }
}
