package intersectionOfTwoArraysII;

import IntersectionOfTwoArraysII.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{2}, s.intersect(new int[]{1, 2}, new int[]{2}));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{4,9}, s.intersect(new int[]{4, 9, 5}, new int[]{9, 3, 4, 1, 8, 9, 4}));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{2, 2}, s.intersect(new int[]{1, 2, 3, 7, 2, 1}, new int[]{2, 6, 8, 2}));
    }

    @Test
    public void test4() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{2}, s.intersect0(new int[]{1, 2}, new int[]{2}));
    }

    @Test
    public void test5() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{4,9}, s.intersect0(new int[]{4, 9, 5}, new int[]{9, 3, 4, 1, 8, 9, 4}));
    }

    @Test
    public void test6() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{2, 2}, s.intersect0(new int[]{1, 2, 3, 7, 2, 1}, new int[]{2, 6, 8, 2}));
    }
}
