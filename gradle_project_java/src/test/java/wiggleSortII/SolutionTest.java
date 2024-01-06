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

    @Test
    public void test3() {
        Solution s = new Solution();
        int[] nums = new int[]{1,5,1,1,6,4};
        s.wiggleSort2(nums);
        Assert.assertArrayEquals(new int[]{1,6,1,5,1,4}, nums);
    }

    @Test
    public void test4() {
        Solution s = new Solution();
        int[] nums = new int[]{1,3,2,2,3,1};
        s.wiggleSort2(nums);
        Assert.assertArrayEquals(new int[]{2,3,1,3,1,2}, nums);
    }

    @Test
    public void test5() {
        Solution s = new Solution();
        int[] nums = new int[]{1,5,1,1,6,4};
        s.wiggleSort2(nums);
        Assert.assertArrayEquals(new int[]{1,6,1,5,1,4}, nums);
    }

    @Test
    public void test6() {
        Solution s = new Solution();
        int[] nums = new int[]{1,1,2,1,2,2,1};
        s.wiggleSort2(nums);
        Assert.assertArrayEquals(new int[]{1,2,1,2,1,2,1}, nums);
    }

    @Test
    public void test7() {
        Solution s = new Solution();
        int[] nums = new int[]{1,1,2,1,2,2,1};
        s.wiggleSort3(nums);
        Assert.assertArrayEquals(new int[]{1,2,1,2,1,2,1}, nums);
    }
}
