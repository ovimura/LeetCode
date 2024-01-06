package matrixCellsInDistanceOrder;

import MatrixCellsInDistanceOrder.Solution;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        int[][] temp = s.allCellsDistOrder(1,2,0,0);
        int[][] rs = new int[][]{{0,0},{0,1}};
        for(int i=0; i<temp.length; i++) {
            Assert.assertArrayEquals(rs[i], temp[i]);
        }
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        int[][] temp = s.allCellsDistOrder(2,2,0,1);
        int[][] rs = new int[][]{{0,1},{0,0},{1,1},{1,0}};
        for(int i=0; i<temp.length; i++) {
            Assert.assertArrayEquals(rs[i], temp[i]);
        }
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        int[][] temp = s.allCellsDistOrder(2,3,1,2);
        int[][] rs = new int[][]{{1,2},{0,2},{1,1},{0,1},{1,0},{0,0}};
        for(int i=0; i<temp.length; i++) {
            Assert.assertArrayEquals(rs[i], temp[i]);
        }
    }
}
