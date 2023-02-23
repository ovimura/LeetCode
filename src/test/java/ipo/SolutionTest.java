package ipo;

import Ipo.*;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        assert 4 == s.findMaximizedCapital(2, 0, new int[]{1,2,3}, new int[]{0,1,1});
    }
}
