package islandPerimeter;

import IslandPerimeter.Solution;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(16, s.islandPerimeter(new int[][]{{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}}));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals(4, s.islandPerimeter(new int[][]{{1}}));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertEquals(4, s.islandPerimeter(new int[][]{{1,0}}));
    }
}
