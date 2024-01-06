package minimumFuelCostToReportToTheCapital;

import MinimumFuelCostToReportToTheCapital.*;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        assert 3 == s.minimumFuelCost(new int[][]{{0,1},{0,2},{0,3}},5);
    }
}
