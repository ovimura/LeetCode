package floodFill;

import FloodFill.*;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        int[][] r = s.floodFill(new int[][]{{1,2,1},{1,2,1},{1,2,1}}, 0,0,3);
        Assert.assertArrayEquals(new int[]{3,2,1}, r[0]);
        Assert.assertArrayEquals(new int[]{3,2,1}, r[1]);
        Assert.assertArrayEquals(new int[]{3,2,1}, r[2]);
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        int[][] r = s.floodFill(new int[][]{{0,0,0},{0,0,0}}, 0,0,0);
        Assert.assertArrayEquals(new int[]{0,0,0}, r[0]);
        Assert.assertArrayEquals(new int[]{0,0,0}, r[1]);
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        int[][] r = s.floodFill(new int[][]{{0,0,0},{0,1,0},{1,0,1}}, 2,1,2);
        Assert.assertArrayEquals(new int[]{0,0,0}, r[0]);
        Assert.assertArrayEquals(new int[]{0,1,0}, r[1]);
        Assert.assertArrayEquals(new int[]{1,2,1}, r[2]);
    }
}
