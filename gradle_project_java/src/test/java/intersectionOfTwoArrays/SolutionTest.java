package intersectionOfTwoArrays;

import IntersectionOfTwoArrays.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{2,3}, s.intersection(new int[]{1,2,3,4}, new int[]{2,3}));
    }
}
