package projectionAreaOf3DShapes;

import ProjectionAreaOf3DShapes.Solution;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(17, s.projectionArea(new int[][]{{1,2},{3,4}}));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals(5, s.projectionArea(new int[][]{{2}}));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertEquals(8, s.projectionArea(new int[][]{{1,0},{0,2}}));
    }

    @Test
    public void test4() {
        Solution s = new Solution();
        Assert.assertEquals(14, s.projectionArea(new int[][]{{1,1,1},{1,0,1},{1,1,1}}));
    }

    @Test
    public void test5() {
        Solution s = new Solution();
        Assert.assertEquals(21, s.projectionArea(new int[][]{{2,2,2},{2,1,2},{2,2,2}}));
    }
}
