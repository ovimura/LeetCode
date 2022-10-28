package setMismatch;

import SetMismatch.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{1,2}, s.findErrorNums(new int[]{1,1})); // 1,2
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{2,3}, s.findErrorNums(new int[]{1,2,2,4})); // 2,3
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{2,1}, s.findErrorNums(new int[]{2,2}));// 1,2
    }

    @Test
    public void test4() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{3,1}, s.findErrorNums(new int[]{3,2,3,4,6,5})); // 3,1
    }

    @Test
    public void test5() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{2,1}, s.findErrorNums(new int[]{3,2,2}));
    } // 2,1

    @Test
    public void test6() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{2,10}, s.findErrorNums(new int[]{1,5,3,2,2,7,6,4,8,9}));
    }
}
