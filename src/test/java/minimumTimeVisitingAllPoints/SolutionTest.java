package minimumTimeVisitingAllPoints;

import org.junit.Assert;
import org.junit.Test;
import MinimumTimeVisitingAllPoints.Solution;

public class SolutionTest {
    @Test
    public void test1() {
        int[][] points = new int[][] {{1,1}, {3,4}, {-1,0}};
        Solution s = new Solution();
        Assert.assertEquals(7,s.minTimeToVisitAllPoints(points));
    }

    @Test
    public void test2() {
        int[][] points = new int[][] {{3,2}, {-2,2}};
        Solution s = new Solution();
        Assert.assertEquals(5,s.minTimeToVisitAllPoints(points));
    }
}
