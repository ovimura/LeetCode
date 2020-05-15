package medianOfTwoSortedArrays;

import MedianOfTwoSortedArrays.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        int[] num1 = new int[]{1,3};
        int[] num2 = new int[]{2};
        Solution s = new Solution();
        Assert.assertEquals(2.0, s.findMedianSortedArrays(num1, num2), 0);
    }

    @Test
    public void test2() {
        int[] num1 = new int[]{1,2};
        int[] num2 = new int[]{3,4};
        Solution s = new Solution();
        Assert.assertEquals(2.5, s.findMedianSortedArrays(num1, num2), 0);
    }
}
