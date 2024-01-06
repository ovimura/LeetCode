package cellsWithOddValuesInAMatrix;

import CellsWithOddValuesInAMatrix.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        int result = s.oddCells(2, 3, new int[][]{{0,1}, {1,1}});
        Assert.assertEquals(6,result);
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        int result = s.oddCells(2, 2, new int[][]{{1,1}, {0,0}});
        Assert.assertEquals(0,result);
    }
}
