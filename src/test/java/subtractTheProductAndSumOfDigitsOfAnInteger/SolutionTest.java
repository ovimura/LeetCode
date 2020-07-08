package subtractTheProductAndSumOfDigitsOfAnInteger;

import org.junit.Assert;
import org.junit.Test;
import SubtractTheProductAndSumOfDigitsOfAnInteger.Solution;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(15, s.subtractProductAndSum(234));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals(15, s.subtractProductAndSum1(234));
    }
}
