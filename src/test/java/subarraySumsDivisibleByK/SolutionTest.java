package subarraySumsDivisibleByK;

import SubarraySumsDivisibleByK.*;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        assert 7 == s.subarraysDivByK(new int[]{4,5,0,-2,-3,1}, 5);
    }
}
