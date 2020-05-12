package binarySearch;

import BinarySearch.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution s = new Solution();
        int[] nums = new int[] {1,2,3,4,5,6};
        Assert.assertEquals(2, s.search(nums, 3));
    }
}
