package nextGreaterElementI;

import org.junit.Assert;
import org.junit.Test;

import NextGreaterElementI.*;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{-1,3,-1}, s.nextGreaterElement(new int[]{4,1,2}, new int[]{1,3,4,2}));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{3,-1}, s.nextGreaterElement(new int[]{2,4}, new int[]{1,2,3,4}));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{-1,2,3}, s.nextGreaterElement(new int[]{4,1,2}, new int[]{1,2,3,4}));
    }

    @Test
    public void test4() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{7,7,7,7,7}, s.nextGreaterElement(new int[]{1,3,5,2,4}, new int[]{6,5,4,3,2,1,7}));
    }
}
