package shortestPathWithAlternatingColors;

import ShortestPathWithAlternatingColors.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void tes1() {
        Solution s = new Solution();
        int [] a = s.shortestAlternatingPaths(3, new int[][]{{0,1},{1,2}}, new int[][]{});
        Assert.assertArrayEquals(new int[]{0,1,-1}, a);
    }
}
