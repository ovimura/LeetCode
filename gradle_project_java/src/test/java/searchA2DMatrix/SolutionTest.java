package searchA2DMatrix;

import SearchA2DMatrix.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Boolean r = s.searchMatrix(new int[][]{new int[]{1,   3,  5,  7},
                new int[]{10, 11, 16, 20},
                new int[]{23, 30, 34, 50}}, 3);
        Assert.assertEquals(r, true);
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Boolean r = s.searchMatrix(new int[][]{}, 3);
        Assert.assertEquals(r, false);
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Boolean r = s.searchMatrix(new int[][]{new int[]{}}, 3);
        Assert.assertEquals(r, false);
    }
}
