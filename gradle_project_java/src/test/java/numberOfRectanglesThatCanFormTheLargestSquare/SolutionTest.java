package numberOfRectanglesThatCanFormTheLargestSquare;

import NumberOfRectanglesThatCanFormTheLargestSquare.*;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        assert 3 == s.countGoodRectangles(new int[][]{{5,8},{3,9},{5,12},{16,5}});
    }
}
