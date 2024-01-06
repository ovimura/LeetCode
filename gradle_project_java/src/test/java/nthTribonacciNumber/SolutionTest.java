package nthTribonacciNumber;

import NthTribonacciNumber.*;

import org.junit.Test;

public class SolutionTest {

    // 4
    @Test
    public void test1() {
        Solution s = new Solution();
        assert 4 == s.tribonacci(4);
    }

    // 1389537
    @Test
    public void test2() {
        Solution s = new Solution();
        assert 1389537 == s.tribonacci(25);
    }
}
