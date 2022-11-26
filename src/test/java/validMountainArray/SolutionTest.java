package validMountainArray;

import ValidMountainArray.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertFalse(s.validMountainArray(new int[]{2,1}));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertFalse(s.validMountainArray(new int[]{3,5,5}));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertTrue(s.validMountainArray(new int[]{0,3,2,1}));
    }

    @Test
    public void test4() {
        Solution s = new Solution();
        Assert.assertFalse(s.validMountainArray(new int[]{0,1,2,3,4,5,6,7,8,9}));
    }

    @Test
    public void test5() {
        Solution s = new Solution();
        Assert.assertFalse(s.validMountainArray(new int[]{14,82,89,84,79,70,70,68,67,66,63,60,58,54,44,43,32,28,26,25,
                22,15,13,12,10,8,7,5,4,3}));
    }
}
