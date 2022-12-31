package singleThreadedCPU;

import SingleThreadedCPU.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{0,2,3,1}, s.getOrder(new int[][]{{1,2},{2,4},{3,2},{4,1}}));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{4,3,2,0,1}, s.getOrder(new int[][]{{7,10},{7,12},{7,5},{7,4},{7,2}}));
    }

    @Test
    public void test3() {
        // Expected: [6,1,2,9,4,10,0,11,5,13,3,8,12,7]
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{6,1,2,9,4,10,0,11,5,13,3,8,12,7}, s.getOrder(new int[][]{{19,13}, {16,9},{21,10},{32,25},{37,4},{49,24},{2,15},{38,41},{37,34},{33,6},{45,4},
                {18,18},{46,39},{12,24}}));
    }
}
