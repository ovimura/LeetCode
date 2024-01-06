package baseballGame;

import BaseballGame.Solution;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(30, s.calPoints(new String[]{"5","2","C","D","+"}));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals(27, s.calPoints(new String[]{"5","-2","4","C","D","9","+","+"}));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertEquals(1, s.calPoints(new String[]{"1"}));
    }
}
