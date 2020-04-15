package squaresOfASortedArray;

import SquaresOfASortedArray.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{0,1,9,16,100}, s.sortedSquares(new int[]{-4,-1,0,3,10}));
        int t=0;
        int[]a = new int[]{0,1,9,16,100};
        Assert.assertEquals(0,a[t++]);
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{4,9,9,49,121}, s.sortedSquares(new int[]{-7,-3,2,3,11}));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{0,1,9,16,100}, s.sortedSquares(new int[]{-4,-1,0,3,10}));
    }

    @Test
    public void test4() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{4,9,9,49,121}, s.sortedSquares(new int[]{-7,-3,2,3,11}));
    }
}
