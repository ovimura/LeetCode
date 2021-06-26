package redundantConnection;

import RedundantConnection.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{2,3}, s.findRedundantConnection(new int[][]{{1,2},{1,3}, {2,3}}));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{1,4}, s.findRedundantConnection(new int[][]{{1,2},{2,3},{3,4},{1,4},{1,5}}));
    }
}
