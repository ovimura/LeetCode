package toeplitzMatrix;

import org.junit.Assert;
import org.junit.Test;

import ToeplitzMatrix.Solution;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(true, s.isToeplitzMatrix(new int[][]{{1,2,3,4}, {5,1,2,3}, {9,5,1,2}}));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals(false, s.isToeplitzMatrix(new int[][]{{1,2}, {2,2}}));
    }
}
