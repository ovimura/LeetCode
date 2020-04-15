package findNumbersWithEvenNumberOfDigits;

import FindNumbersWithEvenNumberOfDigits.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(2, s.findNumbers(new int[]{12,345,2,6,7896}));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals(2, s.findNumbers(new int[]{555,901,482,1771}));
    }
}
