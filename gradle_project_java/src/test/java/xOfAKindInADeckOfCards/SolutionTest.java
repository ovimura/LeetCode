package xOfAKindInADeckOfCards;

import XOfAKindInADeckOfCards.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertTrue(s.hasGroupsSizeX(new int[]{1,2,3,4,4,3,2,1}));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertFalse(s.hasGroupsSizeX(new int[]{1,1,1,2,2,2,3,3}));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertFalse(s.hasGroupsSizeX(new int[]{1}));
    }

    @Test
    public void test4() {
        Solution s = new Solution();
        Assert.assertTrue(s.hasGroupsSizeX(new int[]{1,1,1,1,2,2,2,2,2,2}));
    }

    @Test
    public void test5() {
        Solution s = new Solution();
        Assert.assertTrue(s.hasGroupsSizeX(new int[]{0,0,0,1,1,1,1,1,1,2,2,2,3,3,3}));
    }
}
