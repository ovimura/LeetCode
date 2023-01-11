package waterBottles;

import WaterBottles.*;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        assert 13 == s.numWaterBottles(9, 3);
    }
}
