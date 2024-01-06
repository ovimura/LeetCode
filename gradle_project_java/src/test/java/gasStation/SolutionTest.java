package gasStation;

import GasStation.*;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        int r = s.canCompleteCircuit(new int[]{1,2,3,4,5}, new int[]{3,4,5,1,2});
        assert 3 == r;
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        int r = s.canCompleteCircuit(new int[]{2,3,4}, new int[]{3,4,3});
        assert -1 == r;
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        int r = s.canCompleteCircuit(new int[]{5,1,2,3,4}, new int[]{4,4,1,5,1});
        assert 4 == r;
    }

    @Test
    public void test4() {
        Solution s = new Solution();
        int r = s.canCompleteCircuit(new int[]{3,1,1}, new int[]{1,2,2});
        assert 0 == r;
    }
}
