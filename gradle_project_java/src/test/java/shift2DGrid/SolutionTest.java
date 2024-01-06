package shift2DGrid;

import Shift2DGrid.*;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        List<List<Integer>> r = s.shiftGrid(new int[][]{{1,2,3},{4,5,6},{7,8,9}}, 1);
        Assert.assertArrayEquals(new Integer[]{9,1,2}, r.get(0).toArray(new Integer[]{}));
        Assert.assertArrayEquals(new Integer[]{3,4,5}, r.get(1).toArray(new Integer[]{}));
        Assert.assertArrayEquals(new Integer[]{6,7,8}, r.get(2).toArray(new Integer[]{}));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        List<List<Integer>> r = s.shiftGrid(new int[][]{{3,8,1,9},{19,7,2,5},{4,6,11,10},{12,0,21,13}}, 4);
        Assert.assertArrayEquals(new Integer[]{12,0,21,13}, r.get(0).toArray(new Integer[]{}));
        Assert.assertArrayEquals(new Integer[]{3,8,1,9}, r.get(1).toArray(new Integer[]{}));
        Assert.assertArrayEquals(new Integer[]{19,7,2,5}, r.get(2).toArray(new Integer[]{}));
        Assert.assertArrayEquals(new Integer[]{4,6,11,10}, r.get(3).toArray(new Integer[]{}));
    }
}
