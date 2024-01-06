package getMaximumInGeneratedArray;

import GetMaximumInGeneratedArray.*;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        assert 3 == s.getMaximumGenerated(7);
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        assert 1 == s.getMaximumGenerated(2);
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        assert 2 == s.getMaximumGenerated(3);
    }

    @Test
    public void test4() {
        Solution s = new Solution();
        assert 2 == s.getMaximumGenerated(3);
    }

    @Test
    public void test5() {
        Solution s = new Solution();
        assert 1 == s.getMaximumGenerated(1);
    }
}
