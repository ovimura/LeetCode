package specialPositionsInABinaryMatrix;

import SpecialPositionsInABinaryMatrix.*;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        assert 1 == s.numSpecial(new int[][]{{1,0,0},{0,0,1},{1,0,0}});
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        assert 3 == s.numSpecial(new int[][]{{1,0,0},{0,1,0},{0,0,1}});
    }
}
