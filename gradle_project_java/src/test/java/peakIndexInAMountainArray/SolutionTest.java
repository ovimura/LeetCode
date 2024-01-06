package peakIndexInAMountainArray;

import PeakIndexInAMountainArray.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(1, s.peakIndexInMountainArray(new int[]{0,1,0}));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals(1, s.peakIndexInMountainArray(new int[]{0,2,1,0}));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertEquals(1, s.peakIndexInMountainArray(new int[]{0,10,5,2}));
    }

    @Test
    public void test4() {
        Solution s = new Solution();
        Assert.assertEquals(2, s.peakIndexInMountainArray(new int[]{3,4,5,1}));
    }

    @Test
    public void test5() {
        Solution s = new Solution();
        Assert.assertEquals(2, s.peakIndexInMountainArray(new int[]{24,69,100,99,79,78,67,36,26,19}));
    }
}
