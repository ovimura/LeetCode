package maximumSubarray;

import MaximumSubarray.*;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        int r = s.maxSubArray(new int[]{1,2,3});
        assert 6 == r;
    }
}
