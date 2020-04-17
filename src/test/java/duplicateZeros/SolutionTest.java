package duplicateZeros;

import DuplicateZeros.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        int[] arr = new int[]{1,0,2,3,0,4,5,0};
        s.duplicateZeros(arr);
        Assert.assertArrayEquals(new int[]{1,0,0,2,3,0,0,4}, arr);
    }
    @Test
    public void test2() {
        Solution s = new Solution();
        int[] arr = new int[]{1,2,3};
        s.duplicateZeros(arr);
        Assert.assertArrayEquals(new int[]{1,2,3}, arr);
    }
}
