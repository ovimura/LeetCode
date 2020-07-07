package howManyNumbersAreSmallerThanTheCurrentNumber;

import org.junit.Assert;
import org.junit.Test;
import HowManyNumbersAreSmallerThanTheCurrentNumber.Solution;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{}, s.smallerNumbersThanCurrent(new int[]{}));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{4,0,1,1,3}, s.smallerNumbersThanCurrent(new int[]{8,1,2,2,3}));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{0,0,0,0}, s.smallerNumbersThanCurrent(new int[]{7,7,7,7}));
    }
}
