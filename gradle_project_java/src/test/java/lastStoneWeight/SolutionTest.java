package lastStoneWeight;

import LastStoneWeight.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(1, s.lastStoneWeight(new int[]{2, 7, 4, 1, 8, 1}));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals(1, s.lastStoneWeight(new int[]{1}));
    }


}
