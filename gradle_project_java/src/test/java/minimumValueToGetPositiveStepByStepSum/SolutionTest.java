package minimumValueToGetPositiveStepByStepSum;

import MinimumValueToGetPositiveStepByStepSum.*;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        assert 5 == s.minStartValue(new int[]{-3,2,-3,4,2});
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        assert 1 == s.minStartValue(new int[]{1,2});
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        assert 5 == s.minStartValue(new int[]{1,-2,-3});
    }
}
