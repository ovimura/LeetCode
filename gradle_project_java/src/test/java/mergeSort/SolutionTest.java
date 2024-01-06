package mergeSort;

import MergeSort.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        int[] arr = new int[]{3,4,6,2,1,5};
        s.sort(arr, 0, 5);
        Assert.assertArrayEquals(new int[]{1,2,3,4,5,6}, arr);
    }
}
