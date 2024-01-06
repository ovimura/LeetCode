package degreeOfAnArray;

import DegreeOfAnArray.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(2,s.findShortestSubArray(new int[]{1,2,2,3,1}));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals(6,s.findShortestSubArray(new int[]{1,2,2,3,1,4,2}));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertEquals(7,s.findShortestSubArray(new int[]{2,1,1,2,1,3,3,3,1,3,1,3,2}));
    }
}
