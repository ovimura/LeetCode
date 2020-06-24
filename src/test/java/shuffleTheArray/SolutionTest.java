package shuffleTheArray;

import ShuffleTheArray.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        int[] nums = new int[]{2,5,1,3,4,7};
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{2,3,5,4,1,7}, s.shuffle(nums, 3));
    }
}
