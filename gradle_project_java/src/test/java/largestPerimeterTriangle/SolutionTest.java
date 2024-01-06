package largestPerimeterTriangle;

import LargestPerimeterTriangle.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(5, s.largestPerimeter(new int[]{2,1,2}));
    }
}
