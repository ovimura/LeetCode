package divisorGame;

import org.junit.Assert;
import org.junit.Test;

import DivisorGame.*;


public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(true, s.divisorGame(2));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals(false, s.divisorGame(3));
    }
}
