package defuseTheBomb;

import DefuseTheBomb.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        int[] r = s.decrypt(new int[]{5,7,1,4}, 3);
        Assert.assertArrayEquals(new int[]{12,10,16,13}, r);
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        int[] r = s.decrypt(new int[]{1,2,3,4}, 0);
        Assert.assertArrayEquals(new int[]{0,0,0,0}, r);
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        int[] r = s.decrypt(new int[]{2,4,9,3}, -2);
        Assert.assertArrayEquals(new int[]{12,5,6,13}, r);
    }
}
