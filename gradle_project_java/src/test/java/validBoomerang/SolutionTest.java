package validBoomerang;

import ValidBoomerang.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertTrue(s.isBoomerang(new int[][]{{1,1},{2,3},{3,2}}));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertFalse(s.isBoomerang(new int[][]{{1,1},{2,2},{3,3}}));
    }
}
