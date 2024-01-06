package calculateAmountPaidInTaxes;

import CalculateAmountPaidInTaxes.*;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        double r = s.calculateTax(new int[][]{{3,50},{7,10},{12,25}}, 10);
        assert (2.65000 == r);
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        double r = s.calculateTax(new int[][]{{1,0},{4,25},{5,50}}, 2);
        assert (0.25 == r);
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        double r = s.calculateTax(new int[][]{{2,50}}, 0);
        assert (0.0 == r);
    }
}
