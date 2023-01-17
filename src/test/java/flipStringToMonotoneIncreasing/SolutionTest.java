package flipStringToMonotoneIncreasing;

import FlipStringToMonotoneIncreasing.*;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        assert 1 == s.minFlipsMonoIncr("00110");
    }
}
