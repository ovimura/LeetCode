package plusOne;

import PlusOne.Solution;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution s = new Solution();
        int[] t = s.plusOne(new int[]{1,2,3});
        Assert.assertArrayEquals(new int[]{1,2,4}, s.plusOne(new int[]{1,2,3}));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{4,3,2,2}, s.plusOne(new int[]{4,3,2,1}));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{1}, s.plusOne(new int[]{0}));
    }

    @Test
    public void test4() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{1, 0}, s.plusOne(new int[]{9}));
    }

    @Test
    public void test5() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{9,8,7,6,5,4,3,2,1,1}, s.plusOne(new int[]{9,8,7,6,5,4,3,2,1,0}));
    }

    @Test
    public void test6() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{9,0,0,0}, s.plusOne(new int[]{8,9,9,9}));
    }
}
