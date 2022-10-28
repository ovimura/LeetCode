package maximumAverageSubarrayI;

import MaximumAverageSubarrayI.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        assert 12.75 == (s.findMaxAverage(new int[]{1,12,-5,-6,50,3}, 4));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        assert -1.0 == (s.findMaxAverage(new int[]{-1}, 1));
    }
}
