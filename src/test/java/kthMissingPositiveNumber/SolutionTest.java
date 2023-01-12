package kthMissingPositiveNumber;

import KthMissingPositiveNumber.*;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        int r = s.findKthPositive(new int[]{2,3,4,7,11}, 5);
        assert 9 == r;
    }
}
