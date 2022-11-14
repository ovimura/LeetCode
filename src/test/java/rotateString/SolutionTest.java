package rotateString;

import RotateString.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(true, s.rotateString("abcde", "cdeab"));
    }
}
