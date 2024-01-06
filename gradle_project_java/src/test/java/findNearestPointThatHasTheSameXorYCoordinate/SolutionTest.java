package findNearestPointThatHasTheSameXorYCoordinate;

import FindNearestPointThatHasTheSameXorYCoordinate.Solution;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(2, s.nearestValidPoint(3, 4, new int[][]{{1,2},{3,1},{2,4},{2,3},{4,4}}));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals(0, s.nearestValidPoint(3, 4, new int[][]{{3,4}}));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertEquals(-1, s.nearestValidPoint(3, 4, new int[][]{{2,3}}));
    }
}
