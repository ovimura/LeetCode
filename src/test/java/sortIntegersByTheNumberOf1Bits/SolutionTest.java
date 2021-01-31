package sortIntegersByTheNumberOf1Bits;

import SortIntegersByTheNumberOf1Bits.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{0,1,2,4,8,3,5,6,7}, s.sortByBits(new int[]{0,1,2,3,4,5,6,7,8}));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{1,2,4,8,16,32,64,128,256,512,1024}, s.sortByBits(new int[]{1024,512,256,128,64,32,16,8,4,2,1}));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{10000,10000}, s.sortByBits(new int[]{10000,10000}));
    }

    @Test
    public void test4() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{2,3,5,17,7,11,13,19}, s.sortByBits(new int[]{2,3,5,7,11,13,17,19}));
    }

    @Test
    public void test5() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{10,100,10000,1000}, s.sortByBits(new int[]{10,100,1000,10000}));
    }
}
