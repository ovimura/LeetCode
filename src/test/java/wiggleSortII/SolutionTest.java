package wiggleSortII;

import WiggleSortII.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        int[] nums = new int[]{1,5,1,1,6,4};
        s.wiggleSort(nums);
        Assert.assertArrayEquals(new int[]{1,6,1,5,1,4}, nums);
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        int[] nums = new int[]{1,3,2,2,3,1};
        s.wiggleSort(nums);
        Assert.assertArrayEquals(new int[]{2,3,1,3,1,2}, nums);
    }
}
