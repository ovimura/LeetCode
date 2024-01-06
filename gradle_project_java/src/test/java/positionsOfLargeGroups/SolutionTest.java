package positionsOfLargeGroups;

import PositionsOfLargeGroups.*;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        List<List<Integer>> r = s.largeGroupPositions("abbxxxxzzy");
        Assert.assertArrayEquals(new Integer[]{3,6}, r.get(0).toArray(new Integer[]{}));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        List<List<Integer>> r = s.largeGroupPositions("abc");
        assert 0 == r.size();
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        List<List<Integer>> r = s.largeGroupPositions("abcdddeeeeaabbbcd");
        Assert.assertArrayEquals(new Integer[]{3,5}, r.get(0).toArray(new Integer[]{}));
        Assert.assertArrayEquals(new Integer[]{6,9}, r.get(1).toArray(new Integer[]{}));
        Assert.assertArrayEquals(new Integer[]{12,14}, r.get(2).toArray(new Integer[]{}));
    }
}
