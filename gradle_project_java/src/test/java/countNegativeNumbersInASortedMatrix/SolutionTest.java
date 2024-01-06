package countNegativeNumbersInASortedMatrix;

import CountNegativeNumbersInASortedMatrix.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        int[][] nums = new int[][] {{4,3,2,-1}, {3,2,1,-1}, {1,1,-1,-2}, {-1,-1,-2,-3}};
        Assert.assertEquals(8, s.countNegatives(nums));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        int[][] nums = new int[][] {{4,3,2,-1}};
        Assert.assertEquals(1, s.countNegatives(nums));
    }
}
