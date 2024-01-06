package teemoAttacking;

import TeemoAttacking.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(4, s.findPoisonedDuration(new int[]{1,4}, 2));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals(3, s.findPoisonedDuration(new int[]{1,2}, 2));
    }
}
