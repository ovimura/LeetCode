package minimumSubsequenceInNonIncreasingOrder;

import java.util.List;
import MinimumSubsequenceInNonIncreasingOrder.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        int[] nums = {4,2,7};
        Assert.assertArrayEquals(new int[]{2,4,7}, s.insertionSort(nums));
    }
}
