package redundantConnection;

import RedundantConnection.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{2,3}, s.findRedundantConnection(new int[][]{{1,2},{1,3}, {2,3}}));
        Assert.assertArrayEquals(new int[]{2,3}, s.findRedundantConnection_1(new int[][]{{1,2},{1,3}, {2,3}}));
        Assert.assertArrayEquals(new int[]{2,3}, s.findRedundantConnection1(new int[][]{{1,2},{1,3}, {2,3}}));
    }

    @Test
    public void test11() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{2,3}, s.findRedundantConnection_1(new int[][]{{1,2},{1,3}, {2,3}}));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{1,4}, s.findRedundantConnection(new int[][]{{1,2},{2,3},{3,4},{1,4},{1,5}}));
        Assert.assertArrayEquals(new int[]{1,4}, s.findRedundantConnection_1(new int[][]{{1,2},{2,3},{3,4},{1,4},{1,5}}));
        Assert.assertArrayEquals(new int[]{1,4}, s.findRedundantConnection1(new int[][]{{1,2},{2,3},{3,4},{1,4},{1,5}}));
    }

    @Test
    public void test22() {
        Solution s = new Solution();
        //Assert.assertArrayEquals(new int[]{1,4}, s.findRedundantConnection_1(new int[][]{{1,2},{2,3},{3,4},{1,4},{1,5}}));
        Assert.assertArrayEquals(new int[]{2,5}, s.findRedundantConnection_1(new int[][]{{3,4},{1,2},{2,4},{3,5},{2,5}}));
    }
}
