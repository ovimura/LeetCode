package findPivotIndex;

import FindPivotIndex.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(3, s.pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals(-1, s.pivotIndex(new int[]{1, 7, 3, 6, 6, 6}));
    }
}
