package meanOfArrayAfterRemovingSomeElements;

import MeanOfArrayAfterRemovingSomeElements.*;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        assert 2.0 == s.trimMean(new int[]{1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,3});
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        assert 4.777777777777778 == s.trimMean(new int[]{6,0,7,0,7,5,7,8,3,4,0,7,8,1,6,8,1,1,2,4,8,1,9,5,4,3,8,5,10,8,6,6,1,0,6,10,8,2,3,4});
    }
}
