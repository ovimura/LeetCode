package moveZeros;

import MoveZeros.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution s = new Solution();
        int[] arr = new int[]{};
        s.moveZeroes(arr);
        Assert.assertArrayEquals(new int[]{}, arr);
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        int[] arr = new int[]{0,1,0,3,12};
        s.moveZeroes(arr);
        Assert.assertArrayEquals(new int[]{1,3,12,0,0}, arr);
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        int[] arr = new int[]{1};
        s.moveZeroes(arr);
        Assert.assertArrayEquals(new int[]{1}, arr);
    }
}
