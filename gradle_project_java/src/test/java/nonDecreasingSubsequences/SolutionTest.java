package nonDecreasingSubsequences;

import NonDecreasingSubsequences.*;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        List<List<Integer>> r = s.findSubsequences(new int[]{4,6,7,7});
        Assert.assertArrayEquals(new Integer[]{4,6}, r.get(0).toArray(new Integer[]{}));
        Assert.assertArrayEquals(new Integer[]{4,6,7}, r.get(1).toArray(new Integer[]{}));
        Assert.assertArrayEquals(new Integer[]{4,6,7,7}, r.get(2).toArray(new Integer[]{}));
        Assert.assertArrayEquals(new Integer[]{4,7}, r.get(3).toArray(new Integer[]{}));
        Assert.assertArrayEquals(new Integer[]{4,7,7}, r.get(4).toArray(new Integer[]{}));
        Assert.assertArrayEquals(new Integer[]{6,7}, r.get(5).toArray(new Integer[]{}));
        Assert.assertArrayEquals(new Integer[]{6,7,7}, r.get(6).toArray(new Integer[]{}));
        Assert.assertArrayEquals(new Integer[]{7,7}, r.get(7).toArray(new Integer[]{}));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        List<List<Integer>> r = s.findSubsequences(new int[]{4,4,3,2,1});
        Assert.assertArrayEquals(new Integer[]{4,4}, r.get(0).toArray(new Integer[]{}));
    }
}
