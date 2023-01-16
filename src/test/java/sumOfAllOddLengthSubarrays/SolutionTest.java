package sumOfAllOddLengthSubarrays;

import SumOfAllOddLengthSubarrays.*;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        assert 58 == s.sumOddLengthSubarrays(new int[]{1,4,2,5,3});
    }
}
