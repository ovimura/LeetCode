package findLuckyIntegerInAnArray;

import FindLuckyIntegerInAnArray.*;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        assert 2 == s.findLucky(new int[]{2,2,3,4});
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        assert 3 == s.findLucky(new int[]{1,2,2,3,3,3});
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        assert -1 == s.findLucky(new int[]{2,2,2,3,3});
    }
}
