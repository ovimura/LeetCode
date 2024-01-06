package countSpecialQuadruplets;

import CountSpecialQuadruplets.*;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        assert 1 == (s.countQuadruplets(new int[]{1,2,3,6}));
        assert 4 == (s.countQuadruplets(new int[]{1,1,1,3,5}));
        assert 2 == (s.countQuadruplets(new int[]{9,6,8,23,39,23}));
        assert 1 == (s.countQuadruplets(new int[]{28,8,49,85,37,90,20,8}));
    }
}
