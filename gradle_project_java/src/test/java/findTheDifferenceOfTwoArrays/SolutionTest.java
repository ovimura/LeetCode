package findTheDifferenceOfTwoArrays;

import FindTheDifferenceOfTwoArrays.*;

import javafx.beans.binding.IntegerBinding;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        List<List<Integer>> l = s.findDifference(new int[]{1,2,3}, new int[]{2,4,6});
        Assert.assertArrayEquals(new Integer[]{1,3}, l.get(0).toArray(new Integer[]{}));
        Assert.assertArrayEquals(new Integer[]{4,6}, l.get(1).toArray(new Integer[]{}));

    }

    @Test
    public void test2() {
        Solution s = new Solution();
        List<List<Integer>> l = s.findDifference(new int[]{1,2,3,3}, new int[]{1,1,2,2});
        Assert.assertArrayEquals(new Integer[]{3}, l.get(0).toArray(new Integer[]{}));
        Assert.assertArrayEquals(new Integer[]{}, l.get(1).toArray(new Integer[]{}));
    }
}
