package nimGame;

import NimGame.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertTrue(s.canWinNim(5));
    }
}
