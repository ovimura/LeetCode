package maxPointsOnALine;

import MaxPointsOnALine.*;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        assert 3 == s.maxPoints(new int[][]{{1,1},{2,2},{3,3}});
    }
}
