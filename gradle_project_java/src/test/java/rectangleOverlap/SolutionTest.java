package rectangleOverlap;

import RectangleOverlap.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertTrue(s.isRectangleOverlap(new int[]{0,0,2,2}, new int[]{1,1,3,3}));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertFalse(s.isRectangleOverlap(new int[]{0,0,1,1}, new int[]{1,0,2,1}));
    }
}
