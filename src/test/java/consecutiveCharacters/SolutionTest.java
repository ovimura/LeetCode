package consecutiveCharacters;

import ConsecutiveCharacters.*;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        assert 2 == s.maxPower("leetcode");
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        assert 5 == s.maxPower("abbcccddddeeeeedcba");
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        assert 1 == s.maxPower("tourist");
    }

    @Test
    public void test4() {
        Solution s = new Solution();
        assert 2 == s.maxPower("cc");
    }
}
