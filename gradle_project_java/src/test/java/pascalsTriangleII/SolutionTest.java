package pascalsTriangleII;

import PascalsTriangleII.*;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class SolutionTest {

    @Test
    public void test1() {
        Solution s = new Solution();
        List<Integer> r = s.getRow(3);
        Assert.assertArrayEquals(new Integer[]{1,3,3,1}, r.toArray(new Integer[]{}));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        List<Integer> r = s.getRow(0);
        Assert.assertArrayEquals(new Integer[]{1}, r.toArray(new Integer[]{}));
    }
}
