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
}
