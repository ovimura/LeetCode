package matrixDiagonalSum;

import org.junit.Assert;
import org.junit.Test;
import MatrixDiagonalSum.Solution;


public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        int[][] m = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        Assert.assertEquals(25,s.diagonalSum(m));

    }

    @Test
    public void test2() {
        Solution s = new Solution();
        int[][] m = new int[][]{{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
        Assert.assertEquals(8,s.diagonalSum(m));

    }

    @Test
    public void test3() {
        Solution s = new Solution();
        int[][] m = new int[][]{{5}};
        Assert.assertEquals(5,s.diagonalSum(m));

    }
}
