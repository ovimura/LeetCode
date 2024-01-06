package numberOfStepsToReduceANumberToZero;

import org.junit.Assert;
import org.junit.Test;
import NumberOfStepsToReduceANumberToZero.Solution;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(6, s.numberOfSteps(14));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals(4, s.numberOfSteps(8));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertEquals(12, s.numberOfSteps(123));
    }
}
