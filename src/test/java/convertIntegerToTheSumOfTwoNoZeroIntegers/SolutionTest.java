package convertIntegerToTheSumOfTwoNoZeroIntegers;

import ConvertIntegerToTheSumOfTwoNoZeroIntegers.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{1,1}, s.getNoZeroIntegers(2));
    }
}
