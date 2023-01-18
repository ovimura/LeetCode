package maximumSumCircularSubarray;

import MaximumSumCircularSubarray.*;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        assert 3 == s.maxSubarraySumCircular(new int[]{1,-2,3,-2});
    }
}
