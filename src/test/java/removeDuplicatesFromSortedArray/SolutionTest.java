package removeDuplicatesFromSortedArray;

import RemoveDuplicatesFromSortedArray.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        int[] arr = new int[]{1,1,2};
        int i = s.removeDuplicates(arr);
        Assert.assertEquals(2, i);
        Assert.assertArrayEquals(new int[]{1,2,2}, arr);
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        int[] arr = new int[]{0,0,1,1,1,2,2,3,3,4};
        int i = s.removeDuplicates(arr);
        Assert.assertEquals(5, i);
        Assert.assertArrayEquals(new int[]{0,1,2,3,4,2,2,3,3,4}, arr);
    }
}
