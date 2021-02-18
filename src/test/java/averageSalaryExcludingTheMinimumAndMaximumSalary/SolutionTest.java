package averageSalaryExcludingTheMinimumAndMaximumSalary;

import AverageSalaryExcludingTheMinimumAndMaximumSalary.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(2500.0000, s.average(new int[]{4000,3000,1000,2000}), 0);
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals(2000.0000, s.average(new int[]{1000,2000,3000}), 0);
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertEquals(3500.0000, s.average(new int[]{6000,5000,4000,3000,2000,1000}), 0);
    }

    @Test
    public void test4() {
        Solution s = new Solution();
        Assert.assertEquals(4750.00000, s.average(new int[]{8000,9000,2000,3000,6000,1000}), 0);
    }
}
