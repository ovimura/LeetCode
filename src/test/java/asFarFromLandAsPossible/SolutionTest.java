package asFarFromLandAsPossible;

import AsFarFromLandAsPossible.*;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        assert 2 == s.maxDistance(new int[][]{{1,0,1},{0,0,0},{1,0,1}});
    }
}
