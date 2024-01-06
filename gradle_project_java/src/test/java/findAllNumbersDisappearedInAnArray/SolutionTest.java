package findAllNumbersDisappearedInAnArray;

import FindAllNumbersDisappearedInAnArray.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new Integer[]{1,2,8}, s.findDisappearedNumbers(new int[]{5,4,6,7,9,3,10,9,5,6}).toArray(new Integer[]{}));
    }
}
