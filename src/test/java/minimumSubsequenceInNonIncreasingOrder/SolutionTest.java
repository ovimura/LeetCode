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

    @Test
    public void test2() {
        Solution s = new Solution();
        int[] nums = {4,3,10,9,8};
        s.insertionSort(nums);
        List<Integer> result = s.minSubsequence(nums);
        Integer[] integers = new Integer[]{10,9};
        for (int i=0; i<result.size(); i++) {
            Assert.assertEquals(integers[i],result.get(i));
        }
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        int[] nums = {4,4,7,6,7};
        s.insertionSort(nums);
        List<Integer> result = s.minSubsequence(nums);
        Integer[] integers = new Integer[]{7,7,6};
        for (int i=0; i<result.size(); i++) {
            Assert.assertEquals(integers[i],result.get(i));
        }
    }
}
